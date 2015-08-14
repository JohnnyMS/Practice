#ifndef STATUS_H_
#define STATUS_H_

#include <string>

class Status{
	enum Code{
		cOK = 0,
		cIOERROR = 1,
		cDATAERROR= 2 
	};
	public:
		bool isOK() const{
			return c_ == cOK;
		}
		bool isIOError() const{
			return c_ == cIOERROR;
		}
		bool isDataError() const{
			return c_ == cDATAERROR;
		}

		//static method to construct a Status Object
		static Status OK(){
			return Status(cOK, "OK");
		}
		static Status IOERROR(const std::string& detail = "not known"){
			return Status(cIOERROR, "IOERROR", detail);
		}
		static Status DATAERROR(const std::string& detail = "not known"){
			return Status(cDATAERROR, "data error", detail);
		}

		~Status();

	private:
		Status(Code c, const std::string& type, const std::string& detail = "not known");

		std::string type_;		//type of the status
		std::string detail_;		//detail of the status
		Code c_;
};

#endif
