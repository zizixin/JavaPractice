package zizixin.JavaPractice.getPlace;

public class Place {

	private String placeId;
	
	private String parentPlaceId;
	
	private Place parentPlace;
	
	private String placeName;
	
	private String placeNameDetail;
	
	private String ing;
	
	private String lat;
	
	private Integer level;
	
	private Integer sort;
	
	private String position;

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getParentPlaceId() {
		return parentPlaceId;
	}

	public void setParentPlaceId(String parentPlaceId) {
		this.parentPlaceId = parentPlaceId;
	}

	public Place getParentPlace() {
		return parentPlace;
	}

	public void setParentPlace(Place parentPlace) {
		this.parentPlace = parentPlace;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceNameDetail() {
		return placeNameDetail;
	}

	public void setPlaceNameDetail(String placeNameDetail) {
		this.placeNameDetail = placeNameDetail;
	}

	public String getIng() {
		return ing;
	}

	public void setIng(String ing) {
		this.ing = ing;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
