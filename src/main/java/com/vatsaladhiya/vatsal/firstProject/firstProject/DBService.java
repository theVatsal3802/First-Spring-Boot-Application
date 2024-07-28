package com.vatsaladhiya.vatsal.firstProject.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    // Core dependencies must be made a constructor dependency and not field dependency
    // Don't use autowired for core dependencies
    final private DB db;

    public DBService(DB db) {
        this.db = db;
    }

    String getData() {
        return db.getData();
    }
}
