package Document_task;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] documents = new Document[4];
        for (int i = 0; i < documents.length; i++) {
            System.out.println("Enter the documentId.");
            int documentId = sc.nextInt();
            System.out.println("Enter the Title.");
            String Title = sc.next();
            System.out.println("Enter the FolderName..");
            String FolderName = sc.next();
            System.out.println("Enter the pages..");
            int pages = sc.nextInt();
            documents[i] = new Document(documentId, Title, FolderName, pages);
        }
        Document doc = combineDocs(documents);

        System.out.println(doc.getId() + "\n" + doc.getTitle() + "\n" + doc.getFolderName() + "\n" + doc.getPages());
    }

    public static Document combineDocs(Document[] documents) {

        int id = 0;
        String title = "";
        String folderName = "";
        int pages = 0;
        for (int i = 0; i < documents.length; i++) {
            if (id < documents[i].getId()) {
                id = documents[i].getId();
                title += documents[i].getTitle() + "#";
                folderName += documents[i].getFolderName() + "@";
                pages += documents[i].getPages();
            }
        }

        id++;
        Document doc = new Document(id, title, folderName, pages);
        return doc;
    }
}
