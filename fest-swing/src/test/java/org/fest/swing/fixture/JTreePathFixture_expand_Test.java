/*
 * Created on Dec 27, 2009
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2009-2010 the original author or authors.
 */
package org.fest.swing.fixture;

import static org.easymock.EasyMock.expect;

import org.fest.mocks.EasyMockTemplate;
import org.junit.Test;

/**
 * Tests for <code>{@link JTreePathFixture#expand()}</code>.
 *
 * @author Alex Ruiz
 */
public class JTreePathFixture_expand_Test extends JTreePathFixture_withMockTree_TestCase {

  @Test
  public void should_expand_node() {
    new EasyMockTemplate(tree) {
      protected void expectations() {
        expect(tree.expandPath(path)).andReturn(tree);
      }

      protected void codeToTest() {
        assertThatReturnsSelf(fixture.expand());
      }
    }.run();
  }
}
