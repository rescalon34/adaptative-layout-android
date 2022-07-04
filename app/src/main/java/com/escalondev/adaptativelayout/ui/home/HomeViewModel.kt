package com.escalondev.adaptativelayout.ui.home

import androidx.lifecycle.ViewModel
import com.escalondev.adaptativelayout.model.SpaceItem

class HomeViewModel : ViewModel() {

    fun getSpaceItemList(): List<SpaceItem> =
        mutableListOf<SpaceItem>().apply {
            add(
                SpaceItem(
                    "Comet C",
                    "Imaged on June 20 2022, comet C/2017 K2 (PanSTARRS) shares this wide telescopic field of view with open star cluster IC 4665 and bright star Beta Ophiuchi, near a starry edge of the Milky Way.",
                    "2022-06-30",
                    "https://apod.nasa.gov/apod/image/2206/2017K2_2022-06-20_media.jpg"
                )
            )
            add(
                SpaceItem(
                    "Solar System Family Portrait",
                    "Yes, but have you ever seen all of the planets at once? A rare roll-call of planets has been occurring in the morning sky for much of June.",
                    "2022-06-29",
                    "https://apod.nasa.gov/apod/image/2206/SolSysPortrait_Trigo_1920.jpg"
                )
            )
            add(
                SpaceItem(
                    "The Gum Nebula over Snowy Mountains",
                    "The Gum Nebula is so large and close it is actually hard to see. This interstellar expanse of glowing hydrogen gas frequently evades notice because it spans 35 degrees -- over 70 full Moons -- while much of it is quite dim.",
                    "2022-06-27",
                    "https://apod.nasa.gov/apod/image/2206/GumMountain_WangJin_2400.jpg"
                )
            )
            add(
                SpaceItem(
                    "Spiral Galaxy NGC 6744",
                    "Beautiful spiral galaxy NGC 6744 is nearly 175,000 light-years across, larger than our own Milky Way.",
                    "2022-06-23",
                    "https://apod.nasa.gov/apod/image/2206/NGC6744_chakrabarti2048R.jpg"
                )
            )
            add(
                SpaceItem(
                    "The Gamma Cygni Nebula",
                    "Supergiant star Gamma Cygni is at the center of the Northern Cross. Near the plane of our Milky Way galaxy, that famous asterism flies high in northern summer night skies in the constellation Cygnus the Swan.",
                    "2022-06-18",
                    "https://apod.nasa.gov/apod/image/2206/gamma-cygni-nebula-and-sadr.jpg"
                )
            )
            add(
                SpaceItem(
                    "Good Morning Planets from Chile",
                    "On June 15, innermost planet Mercury had wandered about as far from the Sun as it ever gets in planet Earth's sky. Near the eastern horizon just before sunrise it stands over distant Andes mountain peaks in this predawn snapshot from the valley of Rio Hurtado in Chile.",
                    "2022-06-18",
                    "https://apod.nasa.gov/apod/image/2206/PlanetsfromChile_E-Schulz.jpg"
                )
            )
            add(
                SpaceItem(
                    "Strawberry Supermoon from China",
                    "There are four Full Supermoons in 2022. Using the definition of a supermoon as a Full Moon near perigee, that is within at least 90% of its closest approach to Earth in a given orbit, the year's Full Supermoon dates are May 16, June 14, July 13, and August 12.",
                    "2022-06-16",
                    "https://apod.nasa.gov/apod/image/2206/StrawberrySupermoonfromChina.jpg"
                )
            )
            add(
                SpaceItem(
                    "Satellites Behind Pinnacles",
                    "What are all those streaks across the background? Satellite trails. First, the foreground features picturesque rock mounds known as Pinnacles.",
                    "2022-06-14",
                    "https://apod.nasa.gov/apod/image/2206/StarTrailsPinnacles_Rozells_3872.jpg"
                )
            )
            add(
                SpaceItem(
                    "M51: The Whirlpool Galaxy from Hubble",
                    "The Whirlpool Galaxy is a classic spiral galaxy. At only 30 million light years distant and fully 60 thousand light years across, M51, also known as NGC 5194, is one of the brightest and most picturesque galaxies on the sky.",
                    "2022-06-13",
                    "https://apod.nasa.gov/apod/image/2206/M51_HubbleMiller_5688.jpg"
                )
            )
            add(
                SpaceItem(
                    "The Road and the Milky Way",
                    "At night you can follow this road as it passes through the Dark Sky Alqueva reserve not too far from Alentejo, Portugal. Or you could stop, look up, and follow the Milky Way through the sky. Both stretch from horizon to horizon in this 180 degree panorama recorded on June 3.",
                    "2022-06-11",
                    "https://apod.nasa.gov/apod/image/2206/MilkyWayArchCumeada-fb1200.jpg"
                )
            )
        }
}
