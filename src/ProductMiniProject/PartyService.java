package ProductMiniProject;

import java.util.HashMap;

public interface PartyService {
    public HashMap<Integer, PartyModel> insert(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);

    public void view1(HashMap<Integer, PartyModel> partyMap);

    public HashMap<Integer, PartyModel> view(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);

    public HashMap<Integer, PurchaseModel> delete(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);

    public HashMap<Integer, PartyModel> update(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);

    public HashMap<Integer, PartyModel> search(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);

    public HashMap<Integer, PartyModel> partyData(HashMap<Integer, PartyModel> partyMap, HashMap<Integer, PurchaseModel> pModel);
}
