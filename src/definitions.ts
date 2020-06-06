declare module '@capacitor/core' {
  interface PluginRegistry {
    TestNative: TestNativePlugin;
  }
}

export interface TestNativePlugin {
  echo(options: { value: string }): Promise<{value: string}>;
  launch_intent(options: { value: string }): Promise<{value: string}>;
  // get_str(options: { value: string }): Promise<{value: string}>;
}
