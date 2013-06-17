
Desktop notifications via Twinkle
---------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/twinkle](http://artifacts.griffon-framework.org/plugin/twinkle)


Delivers desktop notifications via [Twinkle][1].

** IMPORTANT **

    Twinkle is released under a dual-licensing scheme.
    Applications built with this plugin must be released under the
    terms of the GPL v3 license unless you purchase a commercial
    license from http://swingfx.ch

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*       | *Type*                                      |
| ------------ | ------------------------------------------- |
| notification | `griffon.plugins.twinkle.impl.Notification` |

`notification` provides a setter friendly API over `ch.swingfx.twinkle.NotificationBuilder` and nothing more. 
Refer to the Javadocs found in the plugin's distribution to learn more about Twinkle's API.

### Example

    import ch.swingfx.twinkle.window.Positions

    application(title: 'Twinkle',
      preferredSize: [320, 240],
      pack: true,
      locationByPlatform:true,
      iconImage: imageIcon('/griffon-icon-48x48.png').image,
      iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                   imageIcon('/griffon-icon-32x32.png').image,
                   imageIcon('/griffon-icon-16x16.png').image]) {
        gridLayout(cols: 3, rows: 3)
        [Positions.NORTH_WEST, Positions.NORTH,  Positions.NORTH_EAST,
         Positions.WEST,       Positions.CENTER, Positions.EAST,
         Positions.SOUTH_WEST, Positions.SOUTH,  Positions.SOUTH_EAST]. each { pos ->
            button(pos.toString(), actionPerformed: { position, event ->
                notification(
                    title: 'Griffon + Twinkle',
                    message: "Hello World ($position)",
                    position: position,
                    icon: imageIcon('/griffon-icon-48x48.png')
                ).show()
            }.curry(pos))
        }
    }

[1]: http://www.swingfx.ch/

