#ifndef CONFIG_H_
#define CONFIG_H_

#include <string>
#include <iostream>
#include <fstream>
#include <sstream>

class Config
{
	public:

		Config(const char* filepath);
		Config();
		~Config(void);

		bool ReadConfig(const char * filepath);

		void PrintConfigInfo();

		int GetNThread(){return numThread_;}

		static const int RUN_TRAIN = 1;
		static const int RUN_TEST = 2;
		static const int RUN_PREDICT = 3;

	private:

		bool read_content( std::ifstream & file, std::string & content );

		int numThread_;

};

#endif 
