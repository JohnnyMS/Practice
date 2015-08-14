#ifndef MYLOG_H_
#define MYLOG_H_

#include <string>
#include <vector>
#include <map>
#include <iostream>
#include <stdarg.h>
#include <stdio.h>

class MyLog{

	public:
		MyLog();
		~MyLog();

		static void turnOn(){logOn = true;}
		static void turnOff(){logOn = false;};

		template <typename T> static void log(const T msg, std::string endSym = "\n");
		template <typename K, typename V> static void log(const std::pair<K, V>& msg, std::string endSym);
		template <typename T> static void log(const std::vector<T>& msg, std::string endSym = "\n");
		template <typename K, typename V> static void log(const std::map<K, V>& msg, std::string endSym = "\n");

		template <typename K, typename V> static void logKV(const K& key, const V& val, std::string endSym = "\n");
		template <typename K, typename V> static void logKV(const K& key, const V* val, std::string endSym = "\n");
		template <typename K, typename V> static void logKV(const K& key, const std::vector<V>& val, std::string endSym = "\n");
		template <typename K, typename VK, typename VV> static void logKV(const K& key, const std::map<VK, VV>& val, std::string endSym = "\n");

		//void format(const char* format,  ...);
	private:
		static bool logOn;

};


template <typename T>
void MyLog::log(const T msg, std::string endSym){
	if(logOn){
		std::cout << msg << endSym;
	}
}

template <typename K, typename V>
void MyLog::log(const std::pair<K, V>& msg, std::string endSym){
	if(logOn){
		log(msg.first, ":");
		log(msg.second, endSym);
	}
}

template <typename T>
void MyLog::log(const std::vector<T>& msg, std::string endSym){
	if(logOn){
		int len = msg.size();
		for(int i = 0; i < len; ++i){
			log(msg[i], " ");
		}
		std::cout << endSym;
	}
}

template <typename K, typename V>
void MyLog::log(const std::map<K, V>& val, std::string endSym){
	if(logOn){
		typename std::map<K, V>::const_iterator it = val.begin();
		for(; it != val.end(); ++it){
			log(it->first, "->");
			log(it->second, " ");
		}
		std::cout << endSym;
	}
}

template <typename K, typename V>
void MyLog::logKV(const K& key, const V& val, std::string endSym){
	if(logOn){
		std::cout << key << ": " << val << endSym;
	}
}

template <typename K, typename V>
void MyLog::logKV(const K& key, const V* val, std::string endSym){
	if(logOn){
		log(key, *val, endSym);
	}
}

template <typename K, typename V>
void MyLog::logKV(const K& key, const std::vector<V>& val, std::string endSym){
	if(logOn){
		std::cout << key << ":";
		log(val, endSym);
	}
}

template <typename K, typename VK, typename VV>
void MyLog::logKV(const K& key, const std::map<VK, VV>& val, std::string endSym){
	if(logOn){
		std::cout << key << ":";
		log(val, endSym);
	}
}

/*
   void MyLog::format(const char* format,  ...){
   char buf[4096];
   char* p = buf;
   va_list args;
   va_start(args, format);
   vsprintf(p, format, args);
   va_end(args);
   std::cout << buf << endl;
   }
   */

#endif
