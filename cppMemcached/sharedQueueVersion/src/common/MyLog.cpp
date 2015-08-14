#include "MyLog.h"

MyLog::MyLog(string fn) : m_fout(fn.c_str()) {
    m_isOn = true;
}

MyLog::~MyLog(){
    m_fout.close();
}

/*
void MyLog::log(string msg, string endSym){
    if(m_isOn)
        m_fout << msg << endSym;
}
*/
