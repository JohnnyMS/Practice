#ifndef SESSIONMANAGER_H_
#define SESSIONMANAGER_H_

#include "common/Status.h"

class SessionManager{

	public:
		SessionManager();
		~SessionManager();

		Status start();
};

#endif
