package SOLID.O.Bad_O;

public class BadModification implements CreateUpgrade{
    public String fileName;

    @Override
    public void change(String fileName, String function) {
        switch (function) {
            case ("Изменить") -> edit();
            case ("Отправить") -> send();
            case ("Удалить") -> delete();
        }
    }
    private void edit() {
        System.out.println("File has been edited!");
    }
    private void send() {
        System.out.println("File has been sent!");
    }
    private void delete() {
        System.out.println("File has been deleted!");
    }

    public static void main(String[] args) {             //постарался показать что пропала ф-ция создания файла
        BadModification mod = new BadModification();
        System.out.println("Я - программа для редактирования файлов FileMaker 2.0!");
        System.out.println("Введите имя файла и введите операцию для файла ('Изменить','Отправить','Удалить')");
        mod.change("Program.zip", "Отправить");
    }
}
