/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.swing.support.typicons

import griffon.plugins.typicons.TypIconFont
import spock.lang.Specification

/**
 * @author Andres Almiray
 */
class TypIconSpec extends Specification {
    def 'Can create a TypIcon instance'() {
        given:
        TypIconFont expected = TypIconFont.AT

        expect:
        TypIcon typIcon = new TypIcon(expected)
        typIcon.typIconFont == expected
    }

    def 'Invalid TypIcon arguments'() {
        when:
        new TypIcon(arg)

        then:
        thrown(IllegalArgumentException)

        where:
        arg   | _
        ''    | _
        ' '   | _
        'foo' | _
    }
}
