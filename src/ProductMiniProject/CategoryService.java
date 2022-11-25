package ProductMiniProject;

import java.util.HashMap;

public interface CategoryService {
    public HashMap<Integer, CategoryModel> insert(HashMap<Integer, CategoryModel> hMap);

    public void view1(HashMap<Integer, CategoryModel> hMap);

    public HashMap<Integer, CategoryModel> view(HashMap<Integer, CategoryModel> hMap);

    public HashMap<Integer, CategoryModel> delete(HashMap<Integer, CategoryModel> hMap);

    public HashMap<Integer, CategoryModel> update(HashMap<Integer, CategoryModel> hMap);

    public HashMap<Integer, CategoryModel> search(HashMap<Integer, CategoryModel> hMap);

    public HashMap<Integer, CategoryModel> categoryData(HashMap<Integer, CategoryModel> hMap);


}
