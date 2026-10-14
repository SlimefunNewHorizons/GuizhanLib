rootProject.name = "guizhanlib"

include(
    "guizhanlib-common",
    "guizhanlib-minecraft",
    "guizhanlib-libraries",
    "guizhanlib-localization",
    "guizhanlib-slimefun",
    // "guizhanlib-slimefun-cn" fuera del build Drake: exige el ABI de Slimefun CN (com.xzavier0722), que el core Drake no trae.
    "guizhanlib-updater",
    "guizhanlib-all",
)
