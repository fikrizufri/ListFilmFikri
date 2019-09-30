
import com.squareup.moshi.Json

data class TopCast(
    @Json(name = "as")
    val asX: String,
    @Json(name = "name")
    val name: String
)