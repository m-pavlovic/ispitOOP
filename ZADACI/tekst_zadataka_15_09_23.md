# ISPIT - OOP (15.09.2023.)
---

&nbsp;

<div style ="text-align:justify">


> Napomena: Rješenje svakog zadatka treba se nalaziti u zasebnoj grani - primjerice za prvi zadatak rješenje treba biti u grani `solutions_zad_1`


<hr>


**Zadatak 1** ![simple](https://img.shields.io/badge/complexity-**-green) (40 min.)
Napravite klasu `Robot` koja ima polje id koje se automatski inkrementira. Također, ime robota se automatski generirar iz finalnog polja **ROOT_NAME** = "Robot_" kojem se dodaje pripadni id. Robot ima atribut `productionDate` tipa `LocalDate` koje se treba automatski generirati privatnom metodom `generateRandomDate` između 01.01.1980. i 31.12.2022. Robote u glavnom dijelu programa dodajete u strukturu podataka **TreeSet** pripadno parametriziranu, a sa mogućnosti sortiranaj po *datumu proizvodnje*. U glavnom dijelu programa osigurajte privatnu metodu koja automatski generira N robota i postavvlja ih u **ArrayList**. Potom u tu listu dodajte dva puta istog robota kojeg kreirate samostalno. Na kraju iz te liste trebate kreirati traženi TreeMap. U glavnom dijelu programa trebate imati parametriziranu metodu koja će moći ispisati sve objekte bilo koje JAVA kolekcije. 

> Ne zaboravite napraviti @Override toString metode robota

Mogući konzolni izlaz:

```

ArrayList:
Robot{id=105, dateOfProduction=1980-03-04, name='Robot_105'}
Robot{id=106, dateOfProduction=1999-03-14, name='Robot_106'}
Robot{id=107, dateOfProduction=2021-11-25, name='Robot_107'}
Robot{id=108, dateOfProduction=2017-07-03, name='Robot_108'}
Robot{id=109, dateOfProduction=2008-10-04, name='Robot_109'}
Robot{id=100, dateOfProduction=1992-07-06, name='Robot_100'}
Robot{id=100, dateOfProduction=1992-07-06, name='Robot_100'}
----------------------------------------------------------------------------------
TreeMap:
Robot{id=105, dateOfProduction=1980-03-04, name='Robot_105'}
Robot{id=100, dateOfProduction=1992-07-06, name='Robot_100'}
Robot{id=106, dateOfProduction=1999-03-14, name='Robot_106'}
Robot{id=109, dateOfProduction=2008-10-04, name='Robot_109'}
Robot{id=108, dateOfProduction=2017-07-03, name='Robot_108'}
Robot{id=107, dateOfProduction=2021-11-25, name='Robot_107'}
```


**Zadatak 2:** ![simple](https://img.shields.io/badge/complexity-**-green) (45 min.) Trebate kreirati GUI prema priloženoj slici. BMI se računa po sljedećoj formuli:

```math
BMI = \frac{masa[kg]}{visina*visina[m^2]}
``` 


![GUI_BMI](https://onedrive.live.com/embed?resid=C39637E73EC828A%2167530&authkey=%21AF8QY2yVKH-Kh5M&width=982&height=882)

**Slika 1** Izgled GUI-a uz drugi zadatak 

Smatramo, zbog jednostavnosti, da se svaki unos odnosi na drugu osobu. To podrazumijeva da se treba kreirati klasa `Person` koja će pored id-a koji se dodjeljuje automatski imati atribut za BMI i za `Age group`. Pripadni podaci se po kliku na `Calculate BMI` ispisuju u tekstualnom području. Dugme `Clear`briše sve podatke, ali ga nije moguće aktivirati dok se podaci ne spreme (u proizvoljnu txt datoteku). Dugme `Read` omogućava prikaz ranije spremljenih podataka iz bilo koje *txt* datoteke, ali na način da se dodaju postojećem prikazu ako isti postoji. 

> **NAPOMENA:** Rješenje treba imati MainFrame, FormPanel, ToolBar i ViewPanel. 



**Zadatak 3** ![gentle](https://img.shields.io/badge/complexity-***-yellowgreen) (45 min.)
Potrebno je napraviti rješenje u JAVI  prema dijagramu klasa na slici 2. Klasa `Actor` pored polja ime i id ima i listu filmova u kojoj je neki glumac glumio. To znači da je potrebno osigurati mehanizam provjere kako se ne bi našli isti filmovi više puta u tom popisu. Ta klasa ima još i metodu za ispis svih filova u kojima je glumac glumio. Druga klasa `Movie` ima polja prema dijagramu klasa, s tim što godinu u kojoj je film snimljen trebate generirari automatski u rasponu od 1900. do 2023. Žanr je pobrojanog tipa i također je potrebno osigurati automatsko, slučajno generiranje žanra. Dodavanje glumaca koji glume u filmu se odvija putem pripadne metode `addActor` koja ne smije raditi duplikate. U glavnom dijelu programa imate tri dodatne, pomoćne metode:

```
generateActors(int num) -> koja generira num glumaca i vraća ih u listi

generateMovies(int N) -> koja generira N filmova i vraća ih u listi

addActorsToMovies -> metoda koja svakom filmu dodjeljuje isti broj slučajno odabranih glumaca iz pripadne liste
```

![DIAG_MOVIE](https://onedrive.live.com/embed?resid=C39637E73EC828A%2167531&authkey=%21AJeskuO_TLx2Glc&width=1666&height=2974)

**Slika 2** Dijagram klasa uz treći zadatak

Moguće testiranje:

```

- generirajte listu glumaca -> npr. 40
- generirajte listu filmova -> npr. 25
- dodajte primjerice po tri glumca u svaki film
- ispišite u kojim filmovima je glumio pojedini glumac 
- ispišite koji glumci su glumili u svakom filmu
```

> **NAPOMENA:** kako se radi o slučajnom odabiru neki glumci mogu biti bez ijednog filma pa za takve trebate osigurati da se ne vrši ispis

Mogući konzolni izlaz:

```
-----------------------------------------------------------------------------------------
--> Actor 0 played in: 
Movie 1
Movie 7
-----------------------------------------------------------------------------------------
--> Actor 1 played in: 
Movie 8
-----------------------------------------------------------------------------------------
--> Actor 2 played in: 
Movie 0
-----------------------------------------------------------------------------------------
--> Actor 3 played in: 
Movie 4
Movie 9
-----------------------------------------------------------------------------------------
--> Actor 4 played in: 
Movie 0
Movie 2
Movie 9
-----------------------------------------------------------------------------------------
--> Actor 5 played in: 
Movie 6
-----------------------------------------------------------------------------------------
--> Actor 6 played in: 
Movie 7
-----------------------------------------------------------------------------------------
--> Actor 8 played in: 
Movie 6
-----------------------------------------------------------------------------------------
--> Actor 9 played in: 
Movie 3
Movie 5
-----------------------------------------------------------------------------------------
--> Actor 10 played in: 
Movie 5
Movie 8
-----------------------------------------------------------------------------------------
--> Actor 11 played in: 
Movie 1
-----------------------------------------------------------------------------------------
--> Actor 13 played in: 
Movie 4
-----------------------------------------------------------------------------------------
--> Actor 14 played in: 
Movie 2
Movie 3
-----------------------------------------------------------------------------------------

MOVIES:

Movie 0
Crime
[Actor 2, Actor 4]
1970
-----------------------------------------------------------------------------------------
Movie 1
Horror
[Actor 0, Actor 11]
1958
-----------------------------------------------------------------------------------------
Movie 2
Romance
[Actor 14, Actor 4]
1927
-----------------------------------------------------------------------------------------
Movie 3
Thriller
[Actor 9, Actor 14]
1992
-----------------------------------------------------------------------------------------
Movie 4
Music
[Actor 13, Actor 3]
1970
-----------------------------------------------------------------------------------------
Movie 5
Fantasy
[Actor 9, Actor 10]
1977
-----------------------------------------------------------------------------------------
Movie 6
Music
[Actor 8, Actor 5]
1979
-----------------------------------------------------------------------------------------
Movie 7
Mystery
[Actor 0, Actor 6]
1930
-----------------------------------------------------------------------------------------
Movie 8
Family
[Actor 1, Actor 10]
1974
-----------------------------------------------------------------------------------------
Movie 9
Music
[Actor 4, Actor 3]
1965
-----------------------------------------------------------------------------------------

```

**Zadatak 4** ![gentle](https://img.shields.io/badge/complexity-***-yellowgreen) (55 min)


Potrebno je kreirati rješenje određeno zahtjevima dijagrama klasa prema slici 1:

![diagCLS]

**Slika 1** Dijagram klasa uz zadatak 3-1

Podaci o posadama nalaze se u csv datoteci `crews.csv` na način da je prvi član popisa uvije kapetan broda. Potrebno je da kreirate tri broda s posadama iz te datoteke. U tom dijelu vam služi pomoćna klasa `AUX_CLS` koja ima sve statičke metode. Metoda `getCrewsData` čita podatke iz csv datoteke i stavlja ih u pripadnu strukturu podataka. Na taj način ćete moći kreirati tri broda sa zadanim posadama, ali s proizvoljnim nazivima. Metoda `listCrewsData` vam služi kao pomoćna metoda kako biste provjerili ispravnost uvoza podataka iz `csv` datoteke. Nakon što ste kreirali objekte klase `Ship` potrebno ih je dodati u klasu `Fleet` korištenjem metode `addShipToFleet` (jedan po jedan). Metoda `listAllShipsFromFleet` te klase vam daje podatke o svim brodovima u floti. Mogući konzolni izlaz je prikazan na slici 2:


![consoleFleet]

**Slika 2** Mogući konzolni izlaz za prvi dio zadatka 3-1

Iz prikaza konzolnog izlaza vidite da se pažnja treba obratiti i na slučaj kada se želi dodati već postojeći brod. S druge strane treba osigurati mogućnost da se brodu zamijeni cijela posada, pa u tom slučaju treba postojati mogućnost ažuriranja podataka za već postojeći brod u floti &rarr; trebate napraviti novu metodu u klasi `Fleet` koja će vršiti tu operaciju ažuriranja (`updateCrewForShip`).  

> **NAPOMENA:** Metoda `updateCrewForShip` nije prikazana u dijagramu klasa na slici 1 i možemo smatrati da predstavlja novi zahtjev za aplikaciju

U drugom dijelu zadatka realizirate metodu `saveShipsToFile` koja listu objekata klase `Ship` sprema u `bin` file. Također, trebate napraviti metodu `loadShipsFromFile` koja omogućuje učitavanje objekata klase `Ship` iz datoteke u pripadnu strukturu podataka. 

> Ovdje imate tipičan primjer serijalizacije i deserijalizacije

Za drugi dio zadatka testiranje može imati sljedeću logiku:

1. Kreirajte dvije posade, npr.
    - String[] newCrew1 = {"captainNew", "newCM-1", "newCM-2", "newCM-3", "newCM-4", "newCM-5", "newVM-6", "newCM-7"};
    - String[] newCrew2 = {"pirateCaptain", "pirate-1", "pirate-2", "pirate-3", "pirate-4", "pirate-5", "pirate-6", "pirate-7",
                           "pirate-8", "pirate-9", "pirate-10", "pirate-11", "pirate-12", "pirate-13", "pirate-14", "pirate-15", "pirate-16", "pirate-17"}
               
2. Kreirajte dva nova broda s tim posadama 
3. Zadajte putanju za `bin` datoteku i spremite u nju listu s ta dva nova broda
4. Učitajte listu brodova iz te datoteke i dodajte ih sve u postojeću flotu &rarr; `addShipsToFleet`
5. Ponovo izlistajte sve brodove u floti

```console
Ensure conditions for an empty file....
Adding ship {New Ship} to file...
Adding ship {Flaying Dutchman} to file...

Loading ship and putting it into the list...
Ship{crew=[captainNew, newCM-1, newCM-2, newCM-3, newCM-4, newCM-5, newVM-6, newCM-7], id=100, name='New Ship', captain='captainNew'}
Loading ship and putting it into the list...
Ship{crew=[pirateCaptain, pirate-1, pirate-2, pirate-3, pirate-4, pirate-5, pirate-6, pirate-7, pirate-8, pirate-9, pirate-10, pirate-11, pirate-12, pirate-13, pirate-14, pirate-15, pirate-16, pirate-17], id=101, name='Flaying Dutchman', captain='pirateCaptain'}
Finished reading data from file: ships1.bin

Adding 2 ships to a fleet...
Adding ship {New Ship} to the fleet!
Adding ship {Flaying Dutchman} to the fleet!

========================== NORTH-SEA-FLEET ==========================
Ship{crew=[captainNew, newCM-1, newCM-2, newCM-3, newCM-4, newCM-5, newVM-6, newCM-7], id=100, name='New Ship', captain='captainNew'}
[captainNew, newCM-1, newCM-2, newCM-3, newCM-4, newCM-5, newVM-6, newCM-7]
Ship{crew=[captain-3, cm_31, cm_32, cm_33, cm_34, cm_35, cm_36, cm_37, cm_38], id=104, name='SH_NAME-3', captain='captain-3'}
[captain-3, cm_31, cm_32, cm_33, cm_34, cm_35, cm_36, cm_37, cm_38]
Ship{crew=[pirateCaptain, pirate-1, pirate-2, pirate-3, pirate-4, pirate-5, pirate-6, pirate-7, pirate-8, pirate-9, pirate-10, pirate-11, pirate-12, pirate-13, pirate-14, pirate-15, pirate-16, pirate-17], id=101, name='Flaying Dutchman', captain='pirateCaptain'}
[pirateCaptain, pirate-1, pirate-2, pirate-3, pirate-4, pirate-5, pirate-6, pirate-7, pirate-8, pirate-9, pirate-10, pirate-11, pirate-12, pirate-13, pirate-14, pirate-15, pirate-16, pirate-17]
Ship{crew=[captain-1, cm_11, cm_12, cm_13, cm_14, cm_15, cm_16, cm_17, cm_18, cm_19, cm_102], id=102, name='SH_NAME-1', captain='captain-1'}
[captain-1, cm_11, cm_12, cm_13, cm_14, cm_15, cm_16, cm_17, cm_18, cm_19, cm_102]
Ship{crew=[captain-2, cm_21, cm_22, cm_23, cm_24, cm_25, cm_26, cm_27, cm_28, cm_29, cm_202, cm_212, cm_222, cm232, cm_242], id=103, name='SH_NAME-2', captain='captain-2'}
[captain-2, cm_21, cm_22, cm_23, cm_24, cm_25, cm_26, cm_27, cm_28, cm_29, cm_202, cm_212, cm_222, cm232, cm_242]
```

> **NAPOMENA:** Pri spremanju liste brodova u bin file uvijek osigurajte da je datoteka prazna. 


**Zadatak 5**  ![gentle](https://img.shields.io/badge/complexity-***-yellowgreen) (50 min)
U ovom zadatku se traži da napravite GUI aplikaciju prema slici 3:

![guiSimpleApp]

**Slika 3** GUI aplikacije uz drugi zadatak

Napravite nekoliko objekata klase `Student`. Svaki put kada unesete podatke za pojedini objekt te klase podaci se spremaju u pripadnu strukturu podataka pogodnu za pretraživanje. Pod department stavite nekoliko proizvoljnih studijskih odjela. Kada se kreira minimalno tri objekta klase `Student` dugme `Search`postaje aktivno te se njime može otvoriti prozor za pretraživanje studenata poa jedinstvenom id-u. Ukoliko traženi id postoji pokažu se pripadni podaci za taj objekt, a u suprotnom akcijski okvir s porukom da traženi podaci ne postoje. Ne zaboravite realizirati i mogućnost prikaza svih objekata koji su trenutno uneseni. 

---

| Oznaka zadataka |Bodovi    | Napomena  |
|:-:|:-:|:-:|
|Prvi i drugi zadatak   | Za ocjenu dovoljan (2)   | ÷  |
|Prvi, drugi i treći  | Za ocjenu dobar (3) |÷   |
|Prvi, drugi i četvrti  | Za ocjenu vrlo dobar (4) |÷   |
|Prvi, drugi i peti  | Za ocjenu izvrstan (5)       | ÷  |

</div>

---
[diagCLS]:https://dub01pap002files.storage.live.com/y4mjQBXOBFdEPKoOS3dy2csOVi63Z_r9vWYRVj6yGXkk-a6EKf0iuhDYQl2BS2mcSh0UHGJzjjkKaOTg83uNJeXqqpifnVAN72lfh5lT8YwnjKEv7OQERyFpO4DVrHkzFva6AW25O7nitG6qZGKOsBzE5oQDlWzdTvzn1uQ-FpM5oNbzWgVnTDjGkGHx89kxd35?width=542&height=660&cropmode=none


[consoleFleet]:https://dub01pap002files.storage.live.com/y4m3-ZvjT9RYXa13ARGusMxcaZNLT40ng22mXmTqA_YMJXehLMeW82WTWN0HUw21WLz09W0WPdtFjX3nN4H-DTNnwRyJCFTi_dy65MglU5QHTokfkqX40xnx1NxN_VLaRS5hCbUn095zx1wi499XD31sEviYnweekoW8AjqxaOURWYSOuEyBlpA4uxTV88znmqH?width=1412&height=406&cropmode=none

[guiSimpleApp]:https://dub01pap002files.storage.live.com/y4mNysQsH7TkzbUhNN13dhLzXminPQSTH0P6UZOhLC01f2Z92-WsOv7FFIlVpp_yp6GWSwHHZxQXAv0wB8nI-uyRRQ4hWN-Xw01XkdojZ-RyvO8-rfDhZ7e6JMUzk-Ub8cZaMQccFsL7rMXk2wEHQqn_bSkCnplE9goDrjVn5oZ8HNqsTf_sgcI_DjpP3poOsWe?width=1575&height=885&cropmode=none

