/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ManagerDocument {

    List<Document> documents;

    public ManagerDocument() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documents.stream().filter(doc -> doc instanceof Newpapers).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
    }
}
