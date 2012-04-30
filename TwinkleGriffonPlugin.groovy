/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class TwinkleGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-twinkle-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Desktop notifications via Twinkle'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}
