import ra.Catalog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog cat1 = new Catalog(1, "Quan Ao", true, null);
        Catalog cat2_1 = new Catalog(2, "Quan Ao Nam", true, cat1);
        Catalog cat2_2 = new Catalog(3, "Quan Ao Nu", true, cat1);
        Catalog cat3_1 = new Catalog(4, "Ao so mi", true, cat2_1);
        Catalog cat3_2 = new Catalog(5, "Quan Au", true, cat2_1);
        Catalog cat2 = new Catalog(6, "Giay dep", true, null);
        Catalog cat2_3 = new Catalog(7,"Giay dep nam",true,cat2);
        Catalog cat2_4 = new Catalog(8,"Giay dep nu",true,cat2);
        List<Catalog> listCat = new ArrayList<>();
        listCat.add(cat1);
        listCat.add(cat2_1);
        listCat.add(cat2_2);
        listCat.add(cat3_1);
        listCat.add(cat3_2);
        listCat.add(cat2);
        listCat.add(cat2_3);
        listCat.add(cat2_4);
        //In danh muc theo cay
        for (Catalog cat : listCat) {
            if (cat.getCatalog()==null){
                displayListCatalog(cat,listCat,0);
            }
        }

    }

    public static void displayListCatalog(Catalog root, List<Catalog> listCat, int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.printf("\t");
        }
        System.out.printf("%d.%s\n", root.getCatalogId(), root.getCatalogName());
        //In de quy cac danh muc con cua root
        //-Lay ra cac danh muc con cua root
        List<Catalog> listChild = new ArrayList<>();
        for (Catalog cat : listCat) {
            if (cat.getCatalog() != null && cat.getCatalog().getCatalogId() == root.getCatalogId()) {
                listChild.add(cat);
            }
        }
        //-In ra thong tin cac danh muc con cua root
        if (listChild.size() != 0) {
            cnt++;
        }
        for (Catalog cat : listChild) {
            displayListCatalog(cat, listCat, cnt);
        }
    }
}