
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

	@SerializedName("src")
	@Expose
	private String src;
	@SerializedName("src_880")
	@Expose
	private String src880;
	@SerializedName("src_zoom")
	@Expose
	private String srcZoom;
	@SerializedName("src_1600")
	@Expose
	private String src1600;
	@SerializedName("src_700")
	@Expose
	private String src700;
	@SerializedName("alt")
	@Expose
	private String alt;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getSrc880() {
		return src880;
	}

	public void setSrc880(String src880) {
		this.src880 = src880;
	}

	public String getSrcZoom() {
		return srcZoom;
	}

	public void setSrcZoom(String srcZoom) {
		this.srcZoom = srcZoom;
	}

	public String getSrc1600() {
		return src1600;
	}

	public void setSrc1600(String src1600) {
		this.src1600 = src1600;
	}

	public String getSrc700() {
		return src700;
	}

	public void setSrc700(String src700) {
		this.src700 = src700;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

}