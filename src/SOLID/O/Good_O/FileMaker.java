package SOLID.O.Good_O;

public class FileMaker implements CreateUpdate{
    @Override
    public void create(String fileName) {
        System.out.println("File " + fileName +" has been created!!!");
    }
    private void editing(String fileName) {
        System.out.println("File " + fileName +" has been edited!");
    }
    private void sending(String fileName) {
        System.out.println("File " + fileName +" has been sent!");
    }
    private void deleting(String fileName) {
        System.out.println("File " + fileName +" has been deleted!");
    }
    public void maker (String fileName,String functions) {
        switch (functions) {
            case ("Создать") -> create(fileName);
            case ("Изменить") -> editing(fileName);
            case ("Отправить") -> sending(fileName);
            case ("Удалить") -> deleting(fileName);
        }
    }

    public static void main(String[] args) {
        FileMaker makingFile = new FileMaker();
        System.out.println("Я - программа для редактирования файлов FileMaker 2.0!");
        System.out.println("Введите имя файла и введите операцию для файла ('Создать','Изменить','Отправить','Удалить')");
        makingFile.maker("Program.zip","Создать");
        makingFile.maker("Program.zip","Изменить");
        makingFile.maker("Program.zip","Отправить");
        makingFile.maker("Program.zip","Удалить");
    }
}
