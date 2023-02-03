package codeup.기초100제;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class 문제1036 {
    public static void main(String[] args) throws IOException {
        List<Map<String, Object>> dataLists = new ArrayList<Map<String, Object>>();
        try {
            Scanner scanner = new Scanner(new File("/Users/minwoochase/dataList.txt"));

            while (scanner.hasNextLine()) {
                Map<String, Object> map = new HashMap<>();
                String[] line = scanner.nextLine().split("\\|");
                System.out.println(Arrays.toString(line));
                String pos_store_cd = line[1].replaceAll("\\t", "");
                String sale_dt = line[2].replaceAll("\\t", "");
                String equip_cd = line[3].replaceAll("\\t", "");
                String recpt_no = line[4].replaceAll("\\t", "");
                String good_cd = line[6].replaceAll("\\t", "");
                String sls_qty = line[8].replaceAll("\\t", "");
                String sls_amt = line[9].replaceAll("\\t", "");
                String settle_meth_cd = line[11].replaceAll("\\t", "");
                String orig_recpt_no = line[12].replaceAll("\\t", "");
                String sale_hhmi = line[13].replaceAll("\\t", "");
                String evt_yn = line[14].replaceAll("\\t", "");
                String notax_cd = line[17].replaceAll("\\t", "");

                map.put("pos_store_cd", pos_store_cd);
                map.put("sale_dt"     , sale_dt);
                map.put("equip_cd"    , equip_cd);
                map.put("recpt_no"    , recpt_no);
                map.put("good_cd"     , good_cd);
                map.put("sls_qty"     , sls_qty);
                map.put("sls_amt"     , sls_amt);
                map.put("settle_meth_cd", settle_meth_cd);
                map.put("orig_recpt_no", orig_recpt_no);
                map.put("sale_hhmi"   , sale_hhmi);
                map.put("evt_yn"      , evt_yn);
                map.put("notax_cd"    , notax_cd);

                dataLists.add(map);
            }
            System.out.println(dataLists);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}