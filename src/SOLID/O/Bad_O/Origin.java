package SOLID.O.Bad_O;

public class Origin implements Create{
    public String file;
    public void create(String file){
        System.out.println("File " + file +" has been created!!!");
    }
    public static void main(String[] args) {
        System.out.println("Я - программа для создания файлов FileMaker 1.0!\nМетод create() создает новый файл!");
        Origin originFile = new Origin();
        originFile.create("Program.zip");
    }
}
