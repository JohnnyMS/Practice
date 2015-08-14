#ifndef ASYNETWORK_H_
#define ASYNETWORK_H_

#include "common/Status.h"
#include "eventEngine/EventEngine.h"

#include <string>
#include <boost/asio.hpp>

class AsyNetwork : public EventEngine{
	
	public:
		AsyNetwork();
		~AsyNetwork();

		Status listen(const std::string& ip, const int port);
		Status accept();
		Status recv();
		Status send();

	private:
		boost::asio::io_service ioService_;
		boost::shared_ptr<boost::asio::io_service::work> p_work_service_;
};

#endif
