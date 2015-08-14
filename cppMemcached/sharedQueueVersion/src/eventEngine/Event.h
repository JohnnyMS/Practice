#ifndef EVENT_H_
#define EVENT_H_

#include "EventEngine.h"

enum EventPriority{
	EVENT_PRIORITY_HIGH,
	EVENT_PRIORITY_NORMAL
};

class EventData{
};

class Event{

	public:
		EventData* getData(){return p_data_;}
		EventEngine* getCaller(){return p_caller_;}

	private:
		EventData* p_data_;
		EventEngine* p_caller_;
		EventPriority pri_;
};

#endif
