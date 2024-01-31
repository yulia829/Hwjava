import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

    public class Notebook {

        private String brand;
        private int ram;
        private int storageCap;
        private String os;
        private String color;
        private double diagonal;
        public Notebook(String brand, int ram, int storageCap, String os, String color, double diagonal){
            this.brand = brand;
            this.ram = ram;
            this.storageCap = storageCap;
            this.os = os;
            this.color = color;
            this.diagonal = diagonal;
        }
        @Override
        public String toString() {
            return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем жесткого диска %d Гб \n Операционная система %s \n Цвет корпуса %s \n диагональ монитора %.1f \n",
                    this.brand, this.ram, this.storageCap, this.os, this.color, this.diagonal);
        }
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Notebook) {
                return this.brand.equals(((Notebook) obj).brand) && this.ram == ((Notebook) obj).ram
                        && this.storageCap == ((Notebook) obj).storageCap && this.os.equals(((Notebook) obj).os)
                        && this.color.equals(((Notebook) obj).color) && this.diagonal == ((Notebook) obj).diagonal;
            }
            return false;
        }
        public int getRam(){
            return this.ram;
        }
        public int getStorageCap(){
            return this.storageCap;
        }
        public String getOS(){
            return this.os;
        }
        public double getDiagonal(){
            return this.diagonal;
        }
    }

    class App {
        public static void main(String[] args) throws Exception {
            Notebook notebook1 = new Notebook("Haier U1510SM", 4, 128, "Windows 10", "серый", 15.6);
            Notebook notebook2 = new Notebook("Dell XPS 15", 16, 32, "Windows 11 Pro", "чёрный", 15.6);
            Notebook notebook3 = new Notebook("Lenovo Legion 5 Pro", 16, 1000, "Windows 10", "чёрный", 16);
            Notebook notebook4 = new Notebook("Gigabyte AORUS 17G", 16, 512, "Windows 10", "черный", 17.3);
            Notebook notebook5 = new Notebook("Irbis NB121", 4, 64, "Windows 10", "серый", 11.6);
            Notebook notebook6 = new Notebook("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
            Notebook notebook7 = new Notebook("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
            Notebook notebook8 = new Notebook("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
            Notebook notebook9 = new Notebook("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
            Notebook notebook10 = new Notebook("MSI GF76 Katana 17", 8, 256, "без ОС", "чёрный", 17.3);
            Notebook notebook11 = new Notebook("IRBIS NB290", 4, 128, "Windows 10", "чёрный", 15.6);
            Notebook notebook12= new Notebook("ASUS Notebook 15", 4, 1000, "Windows 10", "чёрный", 15.6);
            Notebook notebook13= new Notebook("Acer Extensa 15", 4, 256, "Windows 11", "чёрный", 15.6);
            Notebook notebook14= new Notebook("ASUS Vivobook Go 15", 8, 512, "Windows 11", "серый", 15.6);
            Notebook notebook15= new Notebook("MSI Prestige 14", 16, 1024, "Windows 10 Home", "серый", 14);
            Notebook notebook16= notebook1;
            Set<Notebook> unicNotebook = new HashSet<Notebook>();
            unicNotebook.add(notebook1);
            unicNotebook.add(notebook2);
            unicNotebook.add(notebook3);
            unicNotebook.add(notebook4);
            unicNotebook.add(notebook5);
            unicNotebook.add(notebook6);
            unicNotebook.add(notebook7);
            unicNotebook.add(notebook8);
            unicNotebook.add(notebook9);
            unicNotebook.add(notebook10);
            unicNotebook.add(notebook11);
            unicNotebook.add(notebook12);
            unicNotebook.add(notebook13);
            unicNotebook.add(notebook14);
            unicNotebook.add(notebook15);
            unicNotebook.add(notebook16);
            System.out.printf("Первый ноутбук идентичен десятому: %b \n", notebook1.equals(notebook6));
            System.out.printf("Всего уникалных ноутбуков: %d \n", unicNotebook.size());
            Map<Integer, String> mapCrit = new HashMap<>();
            mapCrit.put(1, "объем оперативной памяти");
            mapCrit.put(2, "объем жесткого диска");
            mapCrit.put(3, "Операционная система");
            mapCrit.put(4, "цвет корпуса");
            mapCrit.put(5, "диагональ монитора");
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите характеристики компьютера: 1. объем оперативной памяти: ");
            int ramUser = sc.nextInt();
            System.out.println("объем жесткого диска: ");
            int storUser = sc.nextInt();
            System.out.println("диагональ монитора");
            double digUser = sc.nextDouble();
            for(Notebook lap: unicNotebook) {
                if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser)  && lap.getDiagonal() >= digUser) {
                    System.out.println(lap.toString());
                }
            }
            sc.close();
        }
    }