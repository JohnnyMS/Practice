#include "Config.h"

Config::Config(void)
{
}

Config::Config(const char* filepath){
	ReadConfig(filepath);
}

Config::~Config(void)
{
}


bool Config::ReadConfig(const char * filepath)
{
	if( !filepath )
	{
		cerr << "ERROR: Configurator::ReadConfig() input filepath is null. " << endl;
		return false;
	}

	std::cout << "NOTIFY: Config file path = [ " << filepath << " ]" << endl;

	ifstream file(filepath);

	if(!file.good())
		return false;

	bool loop = true;
	while(loop){
		string content;

		if( !read_content(file, content) ) break;


		if( "[THREAD_NUM]" == content ){
			string tmp;
			if( !read_content(file, tmp) ) break;

			m_runType = atoi(tmp.c_str());

		}else if( "[MODEL_TYPE]" == content ){
			string tmp;
			if( !read_content(file, tmp) ) break;

			m_modelType = atoi(tmp.c_str());

		}
	}

	file.close();

	//Êä³öÅäÖÃÐÅÏ¢
	PrintConfigInfo();

	return true;
}

bool Config::read_content( std::ifstream & file, std::string & content )
{
	std::string line;
	std::stringstream ss;

	while( getline(file, content) )
	{
		ss << line;
		ss >> content;

		if(content.size() == 0 || content[0] == '#'){
			continue;
		}

		return true;
	}

	return false;	
}


void Config::PrintConfigInfo()
{
	std::cout << "|--------------------CONFIG INFO--------------------|" << std::endl;
	std::cout << "> THREAD_NUM = " <<  numThread_ << std::endl;

	std::cout << "|----------------------------------------------------|" << std::endl << std::endl;
}

