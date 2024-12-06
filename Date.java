

public class Date {

private int _day ;
private int _month;
private int _year;



public Date(int day,int month ,int year){
this._day=day;
this._month=month;
this._year=year;
}

public Date(){
this._day=1;
this._month=1;
this._year=2024;
}

public Date(Date other){
this._day=other._day;
this._month=other._month;
this._year=other._year;
}



//getters
public int getDay(){

return this._day;
}

public int getMonth(){

return this._month;
}

public int getYear(){

return this._year;
}

//setters

public void setDay(int dayToSet){
this._day=dayToSet;
};
public void setMonth(int  MonthToSet){
this._month=MonthToSet;
};
public void setYear(int YearToSet){
this._year=YearToSet;
};




public boolean equals(Date other){};
public boolean before(Date other){};
public boolean after (Date other){};
public int diffrence (Date other){};
public String toString(){};
public Date tomorrow(){};









}