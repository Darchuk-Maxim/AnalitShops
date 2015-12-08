import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Максим on 05.12.2015.
 */
public class Products {

    private final String ref[] = {"http://findfood.ru/category/fructi/",
            "http://findfood.ru/category/ovoshi/",
            "http://findfood.ru/category/krupa-i-kacha/",
            "http://findfood.ru/category/detskoe-pitanie/"};

    public List<String> getProducts(String category, String sclad, String postav) {
        StringBuffer stringBuffer = new StringBuffer();
        Document doc = null;
        Random r = new Random();
        String reference = getRef(category);
        List<String> catge = new ArrayList<>();
        try {
            doc = Jsoup.connect(reference).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements elements = doc.select("div.grid_4");
        elements = elements.select("a");
        int j = 0;
        for (int i = 1; i < elements.size(); i += 2) {

//            if (elements.get(i).attr("title").length() > 1) {
//                model.addElement(elements.get(i).attr("title") + "  " + sclad + "  " + postav + "  Остаток: " + r.nextInt(1000) + " Цена за еденицу: "
//                        + (int)(25 + (Math.random() * (221 - 25))) + " Дата прибытия: " + 2015 + "." + (int)(1 + (Math.random() * (12 - 1))) + "." + (int)(1 + (Math.random() * (30 - 1))));
//            }
            if (elements.get(i).attr("title").length() > 1) {
                catge.add( elements.get(i).attr("title"));
                catge.add(sclad);
                catge.add(postav);
                catge.add(String.valueOf(r.nextInt(1000)));
                catge.add(String.valueOf((int)(25 + (Math.random() * (221 - 25)))));
                catge.add(String.valueOf(2015 + "." + (int)(1 + (Math.random() * (12 - 1))) + "." + (int)(1 + (Math.random() * (30 - 1)))));
            }
        }
        return catge;
    }

    public String getRef(String category) {
        if (category.equals("Фрукты"))
            return ref[0];
        else if (category.equals("Овощи"))
            return ref[1];
        else if (category.equals("Крупы") || category.equals("Каши"))
            return ref[2];
        else if (category.equals("Детское питание"))
            return ref[3];
        return "";
    }

}
