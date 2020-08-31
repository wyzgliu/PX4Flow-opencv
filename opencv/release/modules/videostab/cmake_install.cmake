# Install script for directory: /Users/zarathustra/git/opencv-2.4.13.3/modules/videostab

# Set the install prefix
if(NOT DEFINED CMAKE_INSTALL_PREFIX)
  set(CMAKE_INSTALL_PREFIX "/usr/local")
endif()
string(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
if(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  if(BUILD_TYPE)
    string(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  else()
    set(CMAKE_INSTALL_CONFIG_NAME "Release")
  endif()
  message(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
endif()

# Set the component getting installed.
if(NOT CMAKE_INSTALL_COMPONENT)
  if(COMPONENT)
    message(STATUS "Install component: \"${COMPONENT}\"")
    set(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  else()
    set(CMAKE_INSTALL_COMPONENT)
  endif()
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "libs" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES
    "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_videostab.2.4.13.dylib"
    "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_videostab.2.4.dylib"
    )
  foreach(file
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.2.4.13.dylib"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.2.4.dylib"
      )
    if(EXISTS "${file}" AND
       NOT IS_SYMLINK "${file}")
      execute_process(COMMAND "/usr/bin/install_name_tool"
        -id "libopencv_videostab.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_calib3d.2.4.dylib" "libopencv_calib3d.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_core.2.4.dylib" "libopencv_core.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_features2d.2.4.dylib" "libopencv_features2d.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_flann.2.4.dylib" "libopencv_flann.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_gpu.2.4.dylib" "libopencv_gpu.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_highgui.2.4.dylib" "libopencv_highgui.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_imgproc.2.4.dylib" "libopencv_imgproc.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_legacy.2.4.dylib" "libopencv_legacy.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_ml.2.4.dylib" "libopencv_ml.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_objdetect.2.4.dylib" "libopencv_objdetect.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_photo.2.4.dylib" "libopencv_photo.2.4.dylib"
        -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_video.2.4.dylib" "libopencv_video.2.4.dylib"
        "${file}")
      execute_process(COMMAND /usr/bin/install_name_tool
        -add_rpath "/usr/local/lib"
        "${file}")
      if(CMAKE_INSTALL_DO_STRIP)
        execute_process(COMMAND "/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/strip" "${file}")
      endif()
    endif()
  endforeach()
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE SHARED_LIBRARY FILES "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_videostab.dylib")
  if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.dylib" AND
     NOT IS_SYMLINK "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.dylib")
    execute_process(COMMAND "/usr/bin/install_name_tool"
      -id "libopencv_videostab.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_calib3d.2.4.dylib" "libopencv_calib3d.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_core.2.4.dylib" "libopencv_core.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_features2d.2.4.dylib" "libopencv_features2d.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_flann.2.4.dylib" "libopencv_flann.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_gpu.2.4.dylib" "libopencv_gpu.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_highgui.2.4.dylib" "libopencv_highgui.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_imgproc.2.4.dylib" "libopencv_imgproc.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_legacy.2.4.dylib" "libopencv_legacy.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_ml.2.4.dylib" "libopencv_ml.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_objdetect.2.4.dylib" "libopencv_objdetect.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_photo.2.4.dylib" "libopencv_photo.2.4.dylib"
      -change "/Users/zarathustra/git/opencv-2.4.13.3/release/lib/libopencv_video.2.4.dylib" "libopencv_video.2.4.dylib"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.dylib")
    execute_process(COMMAND /usr/bin/install_name_tool
      -add_rpath "/usr/local/lib"
      "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.dylib")
    if(CMAKE_INSTALL_DO_STRIP)
      execute_process(COMMAND "/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/strip" "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/libopencv_videostab.dylib")
    endif()
  endif()
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/deblurring.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/fast_marching.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/fast_marching_inl.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/frame_source.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/global_motion.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/inpainting.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/log.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/motion_stabilizing.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/optical_flow.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/stabilizer.hpp")
endif()

if("${CMAKE_INSTALL_COMPONENT}" STREQUAL "dev" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/opencv2/videostab" TYPE FILE FILES "/Users/zarathustra/git/opencv-2.4.13.3/modules/videostab/include/opencv2/videostab/videostab.hpp")
endif()

