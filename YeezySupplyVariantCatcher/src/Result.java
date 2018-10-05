
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

	@SerializedName("id")
	@Expose
	private long id;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("handle")
	@Expose
	private String handle;
	@SerializedName("vendor")
	@Expose
	private String vendor;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("available")
	@Expose
	private Boolean available;
	@SerializedName("images")
	@Expose
	private List<Image> images = null;
	@SerializedName("featured_image")
	@Expose
	private String featuredImage;
	@SerializedName("options")
	@Expose
	private List<String> options = null;
	@SerializedName("tags")
	@Expose
	private List<String> tags = null;
	@SerializedName("price")
	@Expose
	private Integer price;
	@SerializedName("variants")
	@Expose
	private List<Variant> variants = null;
	@SerializedName("meta")
	@Expose
	private List<Object> meta = null;

	public String getId() {
		String ids = Long.toString(id);
		return ids;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getFeaturedImage() {
		return featuredImage;
	}

	public void setFeaturedImage(String featuredImage) {
		this.featuredImage = featuredImage;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}

	public List<Object> getMeta() {
		return meta;
	}

	public void setMeta(List<Object> meta) {
		this.meta = meta;
	}

}