package com.kopo.d10;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("create")
    public String createTable() {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        db.createTable();
        return "created";
    }

    @GetMapping("insert")
    public String insertData(@RequestParam("name") String name, @RequestParam("sex") String sex) {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        db.insertData(new People(name, sex));
        return "done";
    }

    @GetMapping("update")
    public String updateData(@RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("sex") String sex) {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        db.updateData(new People(idx, name, sex));
        return "done";
    }

    @GetMapping("delete")
    public String deleteData(@RequestParam("idx") int idx) {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        db.deleteData(new People(idx));
        return "done";
    }

    @GetMapping("select")
    public ArrayList<?> selectData() {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        ArrayList<?> list = db.selectData();
        return list;
    }

    @GetMapping("detail")
    public People detailsData(@RequestParam("idx") int idx) {
        DB<People> db = new DB<People>("c:/kopo/p1.db", "people", new People());
        People data = db.detailData(new People(idx));
        return data;
    }
}
