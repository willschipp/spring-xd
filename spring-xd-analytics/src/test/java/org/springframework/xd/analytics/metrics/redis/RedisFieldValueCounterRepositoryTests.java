/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.xd.analytics.metrics.redis;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.xd.analytics.metrics.AbstractFieldValueCounterRepositoryTests;
import org.springframework.xd.analytics.metrics.common.RedisRepositoriesConfig;
import org.springframework.xd.test.redis.RedisAvailableRule;

/**
 * @author Mark Pollack
 * @author Gary Russell
 * @since 1.0
 * 
 */
@ContextConfiguration(classes = RedisRepositoriesConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisFieldValueCounterRepositoryTests extends AbstractFieldValueCounterRepositoryTests {

	@Rule
	public RedisAvailableRule redisAvailableRule = new RedisAvailableRule();

	@After
	@Before
	public void beforeAndAfter() {
		fieldValueCounterRepository.deleteAll();
	}

}
