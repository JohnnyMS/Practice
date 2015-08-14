
#include "EventEngine.h"

EventEngine::EventEngine(){
}

EventEngine::~EventEngine(){
}

Status EventEngine::start(int numThread){

	num_ = numThread;

	//start all threads
	for(int i = 0; i < numThread; ++i){
		threadManager_.create_thread(boost::bind(&EventEngine::run, this));
	}

	return Status::OK();
}

