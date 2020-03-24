package oop.cacttus.education.parameterpassing;

public class PassTest {
    //nese eshte primitive types eshte pass-by-value i shkon vetem kopja e tij
    public void changePrimitiveTypes(int value) {
        ++value;
        value++;
        value = value + 1;
        value += 1;
    }

    //0xF1 dhe 0xF2
    public void changeReference(MyDate from, MyDate to) {
        //from bahet 0xF2
        from = to;
    }

    public void changeObjectDate(MyDate date, int day) {
        date.setDay(day);
    }
}
