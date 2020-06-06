
  Pod::Spec.new do |s|
    s.name = 'TestNativePlugin'
    s.version = '0.0.1'
    s.summary = 'test'
    s.license = 'test'
    s.homepage = 'test'
    s.author = 'test'
    s.source = { :git => 'test', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end