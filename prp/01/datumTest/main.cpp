/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Dan
 *
 * Created on 18. ledna 2018, 17:13
 */

#include <cstdlib>
#include <iostream>
#include "datum.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int r,m,d;
    cout << "Nastaveni data" << endl << "-----------" << endl;
    cout << "Zadej den: ";
    cin >> d;
    cout << "Zadej mesic: ";
    cin >> m;
    cout << "Zadej rok: ";
    cin >> r;
    datum MojeDatum(r,m,d);
    MojeDatum.vypis();
    cout << "Pocet dni od 1.1.1900 je " << MojeDatum.pocetDni() << "." << endl;
    cout << "Je " << MojeDatum.denTyden(MojeDatum.pocetDni()) << ". den v tydnu." << endl;
    return 0;
}

