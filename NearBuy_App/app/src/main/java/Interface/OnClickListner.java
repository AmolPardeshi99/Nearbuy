package Interface;

import Model.popularHangoutsModel;

import Model.ResturantModel;
import Model.SalonModel;

public interface OnClickListner {
    void onItemClicked(SalonModel model, int position);
    void onItemClicked2(ResturantModel model, int position);
    void onItemClicked3(popularHangoutsModel model, int position);
}
