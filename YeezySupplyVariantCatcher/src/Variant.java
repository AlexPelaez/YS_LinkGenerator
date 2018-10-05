
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variant {
	String parentIds;
	String ids = "";
	@SerializedName("id")
	@Expose
	private long id;
	@SerializedName("parent_id")
	@Expose
	private long parentId;
	@SerializedName("available")
	@Expose
	private Boolean available;
	@SerializedName("featured_image")
	@Expose
	private Object featuredImage;
	@SerializedName("public_title")
	@Expose
	private Object publicTitle;
	@SerializedName("requires_shipping")
	@Expose
	private Boolean requiresShipping;
	@SerializedName("price")
	@Expose
	private Integer price;
	@SerializedName("options")
	@Expose
	private List<String> options = null;
	@SerializedName("option1")
	@Expose
	private String option1;
	@SerializedName("option2")
	@Expose
	private String option2;
	@SerializedName("option3")
	@Expose
	private String option3;
	@SerializedName("option4")
	@Expose
	private String option4;

	public String getId() {
		ids = Long.toString(id);
		return ids;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParentId() {
		parentIds = Long.toString(parentId);
		return parentIds;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Object getFeaturedImage() {
		return featuredImage;
	}

	public void setFeaturedImage(Object featuredImage) {
		this.featuredImage = featuredImage;
	}

	public Object getPublicTitle() {
		return publicTitle;
	}

	public void setPublicTitle(Object publicTitle) {
		this.publicTitle = publicTitle;
	}

	public Boolean getRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(Boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

}
