package ProductMiniProject;

public class CategoryModel {
    int id;
    private String categoryName;
    private String categoryDes;

    public CategoryModel(int id, String categoryName, String categoryDes) {
        this.id = id;
        this.categoryName = categoryName;


        this.categoryDes = categoryDes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDes() {
        return categoryDes;
    }

    public void setCategoryDes(String categoryDes) {
        this.categoryDes = categoryDes;
    }
}