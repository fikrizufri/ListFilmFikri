
import com.squareup.moshi.Json

data class Movie(
    @Json(name = "Overview")
    val overview: String,
    @Json(name = "Picture")
    val picture: String,
    @Json(name = "Rating")
    val rating: String,
    @Json(name = "Title")
    val title: String,
    @Json(name = "Top Cast")
    val topCast: List<TopCast>,
    @Json(name = "year")
    val year: String
)