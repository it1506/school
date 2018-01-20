/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   datum.h
 * Author: Dan
 *
 * Created on 18. ledna 2018, 17:14
 */

#ifndef DATUM_H
#define DATUM_H
#include <ctime>
#include <iostream>

class datum {
public:
    datum();
    datum(int,int,int);
    datum(const datum& orig);
    virtual ~datum();
    void vypis();
    int pocetDni();
    int denTyden(int);
private:
    int rok,mesic,den;
    void setSystemDate();
    bool kontrolaData(int,int,int);
    bool prestupnyRok(int);
};

#endif /* DATUM_H */

