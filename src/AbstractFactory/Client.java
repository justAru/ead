//package AbstractFactory;
//
//import CompositeLecture.Leaf;
//
//public class Client {
//    public static void main(String[] args) {
//
//        /*PortableComputerFactory pcf=new PortableComputerFactory("4096",
//                "1024","intel",15.6);*/
//
//        Computer laptop= MainFactory.getComputer(
//                new PortableComputerFactory("4096",
//                        "1024","intel",15.6),ComputerType.LAPTOP);
//        Computer pc=MainFactory.getComputer(
//                new StationaryComputerFactory("4096",
//                        "1024","intel"),ComputerType.PC);
//        Computer server=MainFactory.getComputer(
//                new StationaryComputerFactory("4096",
//                        "1024","intel"),ComputerType.SERVER);
//
//        System.out.println(((PC) pc).msg());
//        System.out.println(((Laptop) laptop).msg());
//
//    }
//
//    public void ClientCode(Leaf leaf) {
//
//
//    }
//}
