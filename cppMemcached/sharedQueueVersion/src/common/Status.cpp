#include "Status.h"

Status::Status(Code c, const std::string& type, const std::string& detail){
	c_ = c;
	type_ = type;
	detail_ = detail;
}


Status::~Status(){
}
