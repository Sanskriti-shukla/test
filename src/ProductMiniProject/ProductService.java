package ProductMiniProject;


import java.util.HashMap;

public interface ProductService {
    public HashMap<Integer, ProductModel> insert(HashMap<Integer, ProductModel> pMap);

    public void view1(HashMap<Integer, ProductModel> pMap);

    public HashMap<Integer, ProductModel> view(HashMap<Integer, ProductModel> pMap);

    public HashMap<Integer, ProductModel> delete(HashMap<Integer, ProductModel> pMap);

    public HashMap<Integer, ProductModel> update(HashMap<Integer, ProductModel> pMap);

    public HashMap<Integer, ProductModel> search(HashMap<Integer, ProductModel> pMap);

    public HashMap<Integer, ProductModel> productData(HashMap<Integer, ProductModel> pMap);
}
