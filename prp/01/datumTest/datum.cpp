/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   datum.cpp
 * Author: Dan
 * 
 * Created on 18. ledna 2018, 17:14
 */

#include "datum.h"
#define MINROK 1900
#define MAXROK 2050

datum::datum() {
}

datum::datum(int rok, int mesic, int den){
    if(kontrolaData(rok,mesic,den)){
        this->rok = rok;
        this->mesic = mesic;
        this->den = den;
    }else{
        setSystemDate();
    }
}
datum::datum(const datum& orig) {
}

datum::~datum() {
}

void datum::setSystemDate(){
    time_t t = time(NULL);
    tm* timePtr = localtime(&t);
   
    this->den=timePtr->tm_mday;
    this->mesic=timePtr->tm_mon+1;
    this->rok=timePtr->tm_year+1900;
}

void datum::vypis(){
    std::cout << "Zadane datum je " << this->den << "." << this->mesic << "." << this->rok << "." << std::endl;
}

bool datum::kontrolaData(int rok, int mesic, int den){
    int dnyMesic[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    if((rok>=MINROK && rok<=MAXROK) && (mesic > 0 && mesic<=12) && ((den > 0 && den <=dnyMesic[mesic-1]) || (this->prestupnyRok(rok) && mesic==2 && den > 0 && den <= 29))){
        return true;
    }else{
        return false;
    }
}

bool datum::prestupnyRok(int rok){
    if((rok%4==0)&&(rok%100!=0)&&(rok%400==0)){
        return true;
    }else{
        return false;
    }
}

int datum::pocetDni(){
    int dnyMesic[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    int dnyMesicPres[] = {31,29,31,30,31,30,31,31,30,31,30,31};
    int pocet=0;
    for(int i=0; i<this->rok-1900; i++){
        for(int e=0; e < 12; e++){
            if(this->prestupnyRok(i+1900)){
                pocet+=dnyMesicPres[e];
            }else{
                pocet+=dnyMesic[e];
            }
        }
    }
    for(int i=0; i<this->mesic; i++){
        if(this->prestupnyRok(this->rok)){
                pocet+=dnyMesicPres[i];
            }else{
                pocet+=dnyMesic[i];
            }
    }
    return pocet+this->den;
}

int datum::denTyden(int pocetDni){
    if(pocetDni%7!=0){
        return pocetDni%7;
    }else{
        return 7;
    }
}