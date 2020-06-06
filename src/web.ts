import { WebPlugin } from '@capacitor/core';
import { TestNativePlugin } from 'test-native-plugin/src/definitions';

export class TestNativePluginWeb extends WebPlugin implements TestNativePlugin {
  constructor() {
    super({
      name: 'TestNativePlugin',
      platforms: ['web']
    });
  }
  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
  async launch_intent(options: { value: string }): Promise<{value: string}> {
    return options;
  }
}

const TestNativePlugin = new TestNativePluginWeb();

export { TestNativePlugin };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(TestNativePlugin);
