#ifndef BLOCKQUEUE_H_
#define BLOCKQUEUE_H_

#include "common/Status.h"

#include <boost/thread/thread.hpp>
#include <boost/thread/mutex.hpp>
#include <boost/thread/condition_variable.hpp>
#include <deque>

template <typename Element>
class BlockQueue : public boost::noncopyable{

	public:
		BlockQueue();
		~BlockQueue();

		size_t size(){return queue_.size();}

		Status pushFront(const Element& e){

			boost::mutex::scoped_lock lock(mutex_);
			queue_.push_front(e);
			if(waitCnt_ > 0){
				cond_.notify_one();
			}

			return Status::OK();
		}
		Status pushBack(const Element& e){
			boost::mutex::scoped_lock lock(mutex_);
			queue_.push_back(e);
			if(waitCnt_ > 0){
				cond_.notify_one();
			}

			return Status::OK();
		}

		Status popFront(Element& e){
			boost::mutex::scoped_lock lock(mutex_);
			while(queue_.size() == 0){
				++waitCnt_;
				cond_.wait(lock);
				--waitCnt_;
			}

			e = queue_.pop_front();
			if(waitCnt_ > 0){
				cond_.notify_one();
			}

			return Status::OK();
		}

		Status tryPopFront(Element& e){
			boost::mutex::scoped_lock lock(mutex_);
			if(queue_.size() == 0){
				return Status::DATAERROR("data in the queue not ready");
			}
			e = queue_.pop_front();
			if(waitCnt_ > 0){
				cond_.notify_one();
			}

			return Status::OK();
		}

	private:
		int waitCnt_;
		std::deque<Element> queue_;
		boost::mutex mutex_;
		boost::condition_variable cond_;

};

#endif
