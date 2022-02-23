import javax.swing.JOptionPane;
//Описание класса
class MyClass{
    //Поля класса:
    int number;
    char symbol;
}
//Описание класса с главным методом программы:
class UsingObjectDemo{
    //Главные метод программы:
    public static void main(String[] args){
        //Создание обьекта:
        MyClass obj=new MyClass();
        //Присваивание значений полям объекта:
        obj.number=100;
        obj.symbol='A';
        //Текст для отображения в диалоговом окне:
        String text="Число: "+obj.number+"\n"+"Символ: "+obj.symbol;
        //Отображение диалогового окна:
        JOptionPane.showMessageDialog(null,text);
    }
}
