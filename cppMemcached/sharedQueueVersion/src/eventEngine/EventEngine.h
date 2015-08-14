#ifndef EVENTENGINE_H_
#define EVENTENGINE_H_

#include "common/Status.h"
#include "BlockQueue.h"
#include "Event.h"
#include <boost/thread.hpp>

class EventEngine{

	public:
		EventEngine();
		virtual ~EventEngine();

		Status start(int numThread);

		virtual Status run() = 0;
		virtual Status onEvent() = 0;

	protected:
		BlockQueue<Event> taskQueue_;

	private:
		boost::thread_group threadManager_;
		int num_;	//number of threads

};

#endif
