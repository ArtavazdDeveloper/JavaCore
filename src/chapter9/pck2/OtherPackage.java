package chapter9.pck2;

import chapter9.pck1.Protection;

class  OtherPackage {
    OtherPackage() {
        Protection pkgObject02 = new Protection();
        System.out.println("Конструктор из другого пакета pkg02");

        //ОШИБКА!!! доступно только для данного класса Protection или пакета pkg01
        //System.out.println("n = " + pkgObject02.n);
        //ОШИБКА!!! доступно только для данного класса Protection
        //System.out.println("n_priv = " + pkgObject02.npriv);
        //ОШИБКА!!! доступно только для данного класса Protection, подкласса Derived или пакета pkg01
        //System.out.println("n_priv = " + pkgObject02.npriv);

        System.out.println("n_publ = " + pkgObject02.n_publ);

    }
}
