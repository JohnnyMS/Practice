
#include "AsyNetwork.h"
#include "common/MyLog.h"

AsyNetwork::AsyNetwork(){
	p_work_service_.reset(new boost::asio::io_service::work(ioService_));
}

AsyNetwork::~AsyNetwork(){
}

Status AsyNetwork::run(){
	try{
		ioService_.run();
		return Status::OK();
	}catch(boost::system::system_error err){
		MyLog::log("Error while io service run:" + err.what());
		return Status::IOERROR(err.what());
	}
}
