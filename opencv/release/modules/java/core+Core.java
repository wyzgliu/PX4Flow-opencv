
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.core;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.utils.Converters;

public class Core {

    // these constants are wrapped inside functions to prevent inlining
    private static String getVersion() { return "2.4.13.3"; }
    private static String getNativeLibraryName() { return "opencv_java2413"; }
    private static int getVersionEpoch() { return 2; }
    private static int getVersionMajor() { return 4; }
    private static int getVersionMinor() { return 13; }
    private static int getVersionRevision() { return 3; }

    public static final String VERSION = getVersion();
    public static final String NATIVE_LIBRARY_NAME = getNativeLibraryName();
    public static final int VERSION_EPOCH = getVersionEpoch();
    public static final int VERSION_MAJOR = getVersionMajor();
    public static final int VERSION_MINOR = getVersionMinor();
    public static final int VERSION_REVISION = getVersionRevision();

    private static final int
            CV_8U = 0,
            CV_8S = 1,
            CV_16U = 2,
            CV_16S = 3,
            CV_32S = 4,
            CV_32F = 5,
            CV_64F = 6,
            CV_USRTYPE1 = 7;


    public static final int
            SVD_MODIFY_A = 1,
            SVD_NO_UV = 2,
            SVD_FULL_UV = 4,
            FILLED = -1,
            LINE_AA = 16,
            LINE_8 = 8,
            LINE_4 = 4,
            REDUCE_SUM = 0,
            REDUCE_AVG = 1,
            REDUCE_MAX = 2,
            REDUCE_MIN = 3,
            DECOMP_LU = 0,
            DECOMP_SVD = 1,
            DECOMP_EIG = 2,
            DECOMP_CHOLESKY = 3,
            DECOMP_QR = 4,
            DECOMP_NORMAL = 16,
            NORM_INF = 1,
            NORM_L1 = 2,
            NORM_L2 = 4,
            NORM_L2SQR = 5,
            NORM_HAMMING = 6,
            NORM_HAMMING2 = 7,
            NORM_TYPE_MASK = 7,
            NORM_RELATIVE = 8,
            NORM_MINMAX = 32,
            CMP_EQ = 0,
            CMP_GT = 1,
            CMP_GE = 2,
            CMP_LT = 3,
            CMP_LE = 4,
            CMP_NE = 5,
            GEMM_1_T = 1,
            GEMM_2_T = 2,
            GEMM_3_T = 4,
            DFT_INVERSE = 1,
            DFT_SCALE = 2,
            DFT_ROWS = 4,
            DFT_COMPLEX_OUTPUT = 16,
            DFT_REAL_OUTPUT = 32,
            DCT_INVERSE = DFT_INVERSE,
            DCT_ROWS = DFT_ROWS,
            DEPTH_MASK_8U = 1 << CV_8U,
            DEPTH_MASK_8S = 1 << CV_8S,
            DEPTH_MASK_16U = 1 << CV_16U,
            DEPTH_MASK_16S = 1 << CV_16S,
            DEPTH_MASK_32S = 1 << CV_32S,
            DEPTH_MASK_32F = 1 << CV_32F,
            DEPTH_MASK_64F = 1 << CV_64F,
            DEPTH_MASK_ALL = (DEPTH_MASK_64F<<1)-1,
            DEPTH_MASK_ALL_BUT_8S = DEPTH_MASK_ALL & ~DEPTH_MASK_8S,
            DEPTH_MASK_FLT = DEPTH_MASK_32F + DEPTH_MASK_64F,
            MAGIC_MASK = 0xFFFF0000,
            TYPE_MASK = 0x00000FFF,
            DEPTH_MASK = 7,
            SORT_EVERY_ROW = 0,
            SORT_EVERY_COLUMN = 1,
            SORT_ASCENDING = 0,
            SORT_DESCENDING = 16,
            COVAR_SCRAMBLED = 0,
            COVAR_NORMAL = 1,
            COVAR_USE_AVG = 2,
            COVAR_SCALE = 4,
            COVAR_ROWS = 8,
            COVAR_COLS = 16,
            KMEANS_RANDOM_CENTERS = 0,
            KMEANS_PP_CENTERS = 2,
            KMEANS_USE_INITIAL_LABELS = 1,
            MARKER_CROSS = 0,
            MARKER_TILTED_CROSS = 1,
            MARKER_STAR = 2,
            MARKER_DIAMOND = 3,
            MARKER_SQUARE = 4,
            MARKER_TRIANGLE_UP = 5,
            MARKER_TRIANGLE_DOWN = 6,
            FONT_HERSHEY_SIMPLEX = 0,
            FONT_HERSHEY_PLAIN = 1,
            FONT_HERSHEY_DUPLEX = 2,
            FONT_HERSHEY_COMPLEX = 3,
            FONT_HERSHEY_TRIPLEX = 4,
            FONT_HERSHEY_COMPLEX_SMALL = 5,
            FONT_HERSHEY_SCRIPT_SIMPLEX = 6,
            FONT_HERSHEY_SCRIPT_COMPLEX = 7,
            FONT_ITALIC = 16;


    //
    // C++:  void LUT(Mat src, Mat lut, Mat& dst, int interpolation = 0)
    //

    //javadoc: LUT(src, lut, dst, interpolation)
    public static void LUT(Mat src, Mat lut, Mat dst, int interpolation)
    {
        
        LUT_0(src.nativeObj, lut.nativeObj, dst.nativeObj, interpolation);
        
        return;
    }

    //javadoc: LUT(src, lut, dst)
    public static void LUT(Mat src, Mat lut, Mat dst)
    {
        
        LUT_1(src.nativeObj, lut.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    //

    //javadoc: Mahalanobis(v1, v2, icovar)
    public static double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    {
        
        double retVal = Mahalanobis_0(v1.nativeObj, v2.nativeObj, icovar.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    //

    //javadoc: PCABackProject(data, mean, eigenvectors, result)
    public static void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat result)
    {
        
        PCABackProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);
        
        return;
    }


    //
    // C++:  void PCACompute(Mat data, Mat& mean, Mat& eigenvectors, int maxComponents = 0)
    //

    //javadoc: PCACompute(data, mean, eigenvectors, maxComponents)
    public static void PCACompute(Mat data, Mat mean, Mat eigenvectors, int maxComponents)
    {
        
        PCACompute_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, maxComponents);
        
        return;
    }

    //javadoc: PCACompute(data, mean, eigenvectors)
    public static void PCACompute(Mat data, Mat mean, Mat eigenvectors)
    {
        
        PCACompute_1(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj);
        
        return;
    }


    //
    // C++:  void PCAComputeVar(Mat data, Mat& mean, Mat& eigenvectors, double retainedVariance)
    //

    //javadoc: PCAComputeVar(data, mean, eigenvectors, retainedVariance)
    public static void PCAComputeVar(Mat data, Mat mean, Mat eigenvectors, double retainedVariance)
    {
        
        PCAComputeVar_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, retainedVariance);
        
        return;
    }


    //
    // C++:  void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    //

    //javadoc: PCAProject(data, mean, eigenvectors, result)
    public static void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat result)
    {
        
        PCAProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);
        
        return;
    }


    //
    // C++:  void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat& dst)
    //

    //javadoc: SVBackSubst(w, u, vt, rhs, dst)
    public static void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat dst)
    {
        
        SVBackSubst_0(w.nativeObj, u.nativeObj, vt.nativeObj, rhs.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void SVDecomp(Mat src, Mat& w, Mat& u, Mat& vt, int flags = 0)
    //

    //javadoc: SVDecomp(src, w, u, vt, flags)
    public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt, int flags)
    {
        
        SVDecomp_0(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj, flags);
        
        return;
    }

    //javadoc: SVDecomp(src, w, u, vt)
    public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt)
    {
        
        SVDecomp_1(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj);
        
        return;
    }


    //
    // C++:  void absdiff(Mat src1, Mat src2, Mat& dst)
    //

    //javadoc: absdiff(src1, src2, dst)
    public static void absdiff(Mat src1, Mat src2, Mat dst)
    {
        
        absdiff_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void absdiff(Mat src1, Scalar src2, Mat& dst)
    //

    //javadoc: absdiff(src1, src2, dst)
    public static void absdiff(Mat src1, Scalar src2, Mat dst)
    {
        
        absdiff_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  void add(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

    //javadoc: add(src1, src2, dst, mask, dtype)
    public static void add(Mat src1, Mat src2, Mat dst, Mat mask, int dtype)
    {
        
        add_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);
        
        return;
    }

    //javadoc: add(src1, src2, dst, mask)
    public static void add(Mat src1, Mat src2, Mat dst, Mat mask)
    {
        
        add_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: add(src1, src2, dst)
    public static void add(Mat src1, Mat src2, Mat dst)
    {
        
        add_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void add(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

    //javadoc: add(src1, src2, dst, mask, dtype)
    public static void add(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype)
    {
        
        add_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);
        
        return;
    }

    //javadoc: add(src1, src2, dst, mask)
    public static void add(Mat src1, Scalar src2, Mat dst, Mat mask)
    {
        
        add_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: add(src1, src2, dst)
    public static void add(Mat src1, Scalar src2, Mat dst)
    {
        
        add_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat& dst, int dtype = -1)
    //

    //javadoc: addWeighted(src1, alpha, src2, beta, gamma, dst, dtype)
    public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst, int dtype)
    {
        
        addWeighted_0(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj, dtype);
        
        return;
    }

    //javadoc: addWeighted(src1, alpha, src2, beta, gamma, dst)
    public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst)
    {
        
        addWeighted_1(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void arrowedLine(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int line_type = 8, int shift = 0, double tipLength = 0.1)
    //

    //javadoc: arrowedLine(img, pt1, pt2, color, thickness, line_type, shift, tipLength)
    public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int line_type, int shift, double tipLength)
    {
        
        arrowedLine_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, line_type, shift, tipLength);
        
        return;
    }

    //javadoc: arrowedLine(img, pt1, pt2, color)
    public static void arrowedLine(Mat img, Point pt1, Point pt2, Scalar color)
    {
        
        arrowedLine_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void batchDistance(Mat src1, Mat src2, Mat& dist, int dtype, Mat& nidx, int normType = NORM_L2, int K = 0, Mat mask = Mat(), int update = 0, bool crosscheck = false)
    //

    //javadoc: batchDistance(src1, src2, dist, dtype, nidx, normType, K, mask, update, crosscheck)
    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K, Mat mask, int update, boolean crosscheck)
    {
        
        batchDistance_0(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K, mask.nativeObj, update, crosscheck);
        
        return;
    }

    //javadoc: batchDistance(src1, src2, dist, dtype, nidx, normType, K)
    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K)
    {
        
        batchDistance_1(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K);
        
        return;
    }

    //javadoc: batchDistance(src1, src2, dist, dtype, nidx)
    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx)
    {
        
        batchDistance_2(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj);
        
        return;
    }


    //
    // C++:  void bitwise_and(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

    //javadoc: bitwise_and(src1, src2, dst, mask)
    public static void bitwise_and(Mat src1, Mat src2, Mat dst, Mat mask)
    {
        
        bitwise_and_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: bitwise_and(src1, src2, dst)
    public static void bitwise_and(Mat src1, Mat src2, Mat dst)
    {
        
        bitwise_and_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void bitwise_not(Mat src, Mat& dst, Mat mask = Mat())
    //

    //javadoc: bitwise_not(src, dst, mask)
    public static void bitwise_not(Mat src, Mat dst, Mat mask)
    {
        
        bitwise_not_0(src.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: bitwise_not(src, dst)
    public static void bitwise_not(Mat src, Mat dst)
    {
        
        bitwise_not_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void bitwise_or(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

    //javadoc: bitwise_or(src1, src2, dst, mask)
    public static void bitwise_or(Mat src1, Mat src2, Mat dst, Mat mask)
    {
        
        bitwise_or_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: bitwise_or(src1, src2, dst)
    public static void bitwise_or(Mat src1, Mat src2, Mat dst)
    {
        
        bitwise_or_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void bitwise_xor(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

    //javadoc: bitwise_xor(src1, src2, dst, mask)
    public static void bitwise_xor(Mat src1, Mat src2, Mat dst, Mat mask)
    {
        
        bitwise_xor_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: bitwise_xor(src1, src2, dst)
    public static void bitwise_xor(Mat src1, Mat src2, Mat dst)
    {
        
        bitwise_xor_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void calcCovarMatrix(Mat samples, Mat& covar, Mat& mean, int flags, int ctype = CV_64F)
    //

    //javadoc: calcCovarMatrix(samples, covar, mean, flags, ctype)
    public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags, int ctype)
    {
        
        calcCovarMatrix_0(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags, ctype);
        
        return;
    }

    //javadoc: calcCovarMatrix(samples, covar, mean, flags)
    public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags)
    {
        
        calcCovarMatrix_1(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags);
        
        return;
    }


    //
    // C++:  void cartToPolar(Mat x, Mat y, Mat& magnitude, Mat& angle, bool angleInDegrees = false)
    //

    //javadoc: cartToPolar(x, y, magnitude, angle, angleInDegrees)
    public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle, boolean angleInDegrees)
    {
        
        cartToPolar_0(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj, angleInDegrees);
        
        return;
    }

    //javadoc: cartToPolar(x, y, magnitude, angle)
    public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle)
    {
        
        cartToPolar_1(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj);
        
        return;
    }


    //
    // C++:  bool checkRange(Mat a, bool quiet = true,  _hidden_ * pos = 0, double minVal = -DBL_MAX, double maxVal = DBL_MAX)
    //

    //javadoc: checkRange(a, quiet, minVal, maxVal)
    public static boolean checkRange(Mat a, boolean quiet, double minVal, double maxVal)
    {
        
        boolean retVal = checkRange_0(a.nativeObj, quiet, minVal, maxVal);
        
        return retVal;
    }

    //javadoc: checkRange(a)
    public static boolean checkRange(Mat a)
    {
        
        boolean retVal = checkRange_1(a.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void circle(Mat& img, Point center, int radius, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

    //javadoc: circle(img, center, radius, color, thickness, lineType, shift)
    public static void circle(Mat img, Point center, int radius, Scalar color, int thickness, int lineType, int shift)
    {
        
        circle_0(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
        
        return;
    }

    //javadoc: circle(img, center, radius, color, thickness)
    public static void circle(Mat img, Point center, int radius, Scalar color, int thickness)
    {
        
        circle_1(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: circle(img, center, radius, color)
    public static void circle(Mat img, Point center, int radius, Scalar color)
    {
        
        circle_2(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  bool clipLine(Rect imgRect, Point& pt1, Point& pt2)
    //

    //javadoc: clipLine(imgRect, pt1, pt2)
    public static boolean clipLine(Rect imgRect, Point pt1, Point pt2)
    {
        double[] pt1_out = new double[2];
        double[] pt2_out = new double[2];
        boolean retVal = clipLine_0(imgRect.x, imgRect.y, imgRect.width, imgRect.height, pt1.x, pt1.y, pt1_out, pt2.x, pt2.y, pt2_out);
        if(pt1!=null){ pt1.x = pt1_out[0]; pt1.y = pt1_out[1]; } 
        if(pt2!=null){ pt2.x = pt2_out[0]; pt2.y = pt2_out[1]; } 
        return retVal;
    }


    //
    // C++:  void compare(Mat src1, Mat src2, Mat& dst, int cmpop)
    //

    //javadoc: compare(src1, src2, dst, cmpop)
    public static void compare(Mat src1, Mat src2, Mat dst, int cmpop)
    {
        
        compare_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, cmpop);
        
        return;
    }


    //
    // C++:  void compare(Mat src1, Scalar src2, Mat& dst, int cmpop)
    //

    //javadoc: compare(src1, src2, dst, cmpop)
    public static void compare(Mat src1, Scalar src2, Mat dst, int cmpop)
    {
        
        compare_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, cmpop);
        
        return;
    }


    //
    // C++:  void completeSymm(Mat& mtx, bool lowerToUpper = false)
    //

    //javadoc: completeSymm(mtx, lowerToUpper)
    public static void completeSymm(Mat mtx, boolean lowerToUpper)
    {
        
        completeSymm_0(mtx.nativeObj, lowerToUpper);
        
        return;
    }

    //javadoc: completeSymm(mtx)
    public static void completeSymm(Mat mtx)
    {
        
        completeSymm_1(mtx.nativeObj);
        
        return;
    }


    //
    // C++:  void convertScaleAbs(Mat src, Mat& dst, double alpha = 1, double beta = 0)
    //

    //javadoc: convertScaleAbs(src, dst, alpha, beta)
    public static void convertScaleAbs(Mat src, Mat dst, double alpha, double beta)
    {
        
        convertScaleAbs_0(src.nativeObj, dst.nativeObj, alpha, beta);
        
        return;
    }

    //javadoc: convertScaleAbs(src, dst)
    public static void convertScaleAbs(Mat src, Mat dst)
    {
        
        convertScaleAbs_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  int countNonZero(Mat src)
    //

    //javadoc: countNonZero(src)
    public static int countNonZero(Mat src)
    {
        
        int retVal = countNonZero_0(src.nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cubeRoot(float val)
    //

    //javadoc: cubeRoot(val)
    public static float cubeRoot(float val)
    {
        
        float retVal = cubeRoot_0(val);
        
        return retVal;
    }


    //
    // C++:  void dct(Mat src, Mat& dst, int flags = 0)
    //

    //javadoc: dct(src, dst, flags)
    public static void dct(Mat src, Mat dst, int flags)
    {
        
        dct_0(src.nativeObj, dst.nativeObj, flags);
        
        return;
    }

    //javadoc: dct(src, dst)
    public static void dct(Mat src, Mat dst)
    {
        
        dct_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  double determinant(Mat mtx)
    //

    //javadoc: determinant(mtx)
    public static double determinant(Mat mtx)
    {
        
        double retVal = determinant_0(mtx.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void dft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    //

    //javadoc: dft(src, dst, flags, nonzeroRows)
    public static void dft(Mat src, Mat dst, int flags, int nonzeroRows)
    {
        
        dft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);
        
        return;
    }

    //javadoc: dft(src, dst)
    public static void dft(Mat src, Mat dst)
    {
        
        dft_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void divide(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    //

    //javadoc: divide(src1, src2, dst, scale, dtype)
    public static void divide(Mat src1, Mat src2, Mat dst, double scale, int dtype)
    {
        
        divide_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);
        
        return;
    }

    //javadoc: divide(src1, src2, dst, scale)
    public static void divide(Mat src1, Mat src2, Mat dst, double scale)
    {
        
        divide_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);
        
        return;
    }

    //javadoc: divide(src1, src2, dst)
    public static void divide(Mat src1, Mat src2, Mat dst)
    {
        
        divide_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void divide(double scale, Mat src2, Mat& dst, int dtype = -1)
    //

    //javadoc: divide(scale, src2, dst, dtype)
    public static void divide(double scale, Mat src2, Mat dst, int dtype)
    {
        
        divide_3(scale, src2.nativeObj, dst.nativeObj, dtype);
        
        return;
    }

    //javadoc: divide(scale, src2, dst)
    public static void divide(double scale, Mat src2, Mat dst)
    {
        
        divide_4(scale, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void divide(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    //

    //javadoc: divide(src1, src2, dst, scale, dtype)
    public static void divide(Mat src1, Scalar src2, Mat dst, double scale, int dtype)
    {
        
        divide_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);
        
        return;
    }

    //javadoc: divide(src1, src2, dst, scale)
    public static void divide(Mat src1, Scalar src2, Mat dst, double scale)
    {
        
        divide_6(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);
        
        return;
    }

    //javadoc: divide(src1, src2, dst)
    public static void divide(Mat src1, Scalar src2, Mat dst)
    {
        
        divide_7(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  void drawMarker(Mat& img, Point position, Scalar color, int markerType = MARKER_CROSS, int markerSize = 20, int thickness = 1, int line_type = 8)
    //

    //javadoc: drawMarker(img, position, color, markerType, markerSize, thickness, line_type)
    public static void drawMarker(Mat img, Point position, Scalar color, int markerType, int markerSize, int thickness, int line_type)
    {
        
        drawMarker_0(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3], markerType, markerSize, thickness, line_type);
        
        return;
    }

    //javadoc: drawMarker(img, position, color)
    public static void drawMarker(Mat img, Point position, Scalar color)
    {
        
        drawMarker_1(img.nativeObj, position.x, position.y, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  bool eigen(Mat src, bool computeEigenvectors, Mat& eigenvalues, Mat& eigenvectors)
    //

    //javadoc: eigen(src, computeEigenvectors, eigenvalues, eigenvectors)
    public static boolean eigen(Mat src, boolean computeEigenvectors, Mat eigenvalues, Mat eigenvectors)
    {
        
        boolean retVal = eigen_0(src.nativeObj, computeEigenvectors, eigenvalues.nativeObj, eigenvectors.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void ellipse(Mat& img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

    //javadoc: ellipse(img, center, axes, angle, startAngle, endAngle, color, thickness, lineType, shift)
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness, int lineType, int shift)
    {
        
        ellipse_0(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
        
        return;
    }

    //javadoc: ellipse(img, center, axes, angle, startAngle, endAngle, color, thickness)
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness)
    {
        
        ellipse_1(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: ellipse(img, center, axes, angle, startAngle, endAngle, color)
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color)
    {
        
        ellipse_2(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void ellipse(Mat& img, RotatedRect box, Scalar color, int thickness = 1, int lineType = 8)
    //

    //javadoc: ellipse(img, box, color, thickness, lineType)
    public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness, int lineType)
    {
        
        ellipse_3(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);
        
        return;
    }

    //javadoc: ellipse(img, box, color, thickness)
    public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness)
    {
        
        ellipse_4(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: ellipse(img, box, color)
    public static void ellipse(Mat img, RotatedRect box, Scalar color)
    {
        
        ellipse_5(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, vector_Point& pts)
    //

    //javadoc: ellipse2Poly(center, axes, angle, arcStart, arcEnd, delta, pts)
    public static void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, MatOfPoint pts)
    {
        Mat pts_mat = pts;
        ellipse2Poly_0(center.x, center.y, axes.width, axes.height, angle, arcStart, arcEnd, delta, pts_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void exp(Mat src, Mat& dst)
    //

    //javadoc: exp(src, dst)
    public static void exp(Mat src, Mat dst)
    {
        
        exp_0(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void extractChannel(Mat src, Mat& dst, int coi)
    //

    //javadoc: extractChannel(src, dst, coi)
    public static void extractChannel(Mat src, Mat dst, int coi)
    {
        
        extractChannel_0(src.nativeObj, dst.nativeObj, coi);
        
        return;
    }


    //
    // C++:  float fastAtan2(float y, float x)
    //

    //javadoc: fastAtan2(y, x)
    public static float fastAtan2(float y, float x)
    {
        
        float retVal = fastAtan2_0(y, x);
        
        return retVal;
    }


    //
    // C++:  void fillConvexPoly(Mat& img, vector_Point points, Scalar color, int lineType = 8, int shift = 0)
    //

    //javadoc: fillConvexPoly(img, points, color, lineType, shift)
    public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color, int lineType, int shift)
    {
        Mat points_mat = points;
        fillConvexPoly_0(img.nativeObj, points_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift);
        
        return;
    }

    //javadoc: fillConvexPoly(img, points, color)
    public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color)
    {
        Mat points_mat = points;
        fillConvexPoly_1(img.nativeObj, points_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void fillPoly(Mat& img, vector_vector_Point pts, Scalar color, int lineType = 8, int shift = 0, Point offset = Point())
    //

    //javadoc: fillPoly(img, pts, color, lineType, shift, offset)
    public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color, int lineType, int shift, Point offset)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        fillPoly_0(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift, offset.x, offset.y);
        
        return;
    }

    //javadoc: fillPoly(img, pts, color)
    public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        fillPoly_1(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void findNonZero(Mat src, Mat& idx)
    //

    //javadoc: findNonZero(src, idx)
    public static void findNonZero(Mat src, Mat idx)
    {
        
        findNonZero_0(src.nativeObj, idx.nativeObj);
        
        return;
    }


    //
    // C++:  void flip(Mat src, Mat& dst, int flipCode)
    //

    //javadoc: flip(src, dst, flipCode)
    public static void flip(Mat src, Mat dst, int flipCode)
    {
        
        flip_0(src.nativeObj, dst.nativeObj, flipCode);
        
        return;
    }


    //
    // C++:  void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat& dst, int flags = 0)
    //

    //javadoc: gemm(src1, src2, alpha, src3, beta, dst, flags)
    public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat dst, int flags)
    {
        
        gemm_0(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, beta, dst.nativeObj, flags);
        
        return;
    }

    //javadoc: gemm(src1, src2, alpha, src3, beta, dst)
    public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat dst)
    {
        
        gemm_1(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, beta, dst.nativeObj);
        
        return;
    }


    //
    // C++:  string getBuildInformation()
    //

    //javadoc: getBuildInformation()
    public static String getBuildInformation()
    {
        
        String retVal = getBuildInformation_0();
        
        return retVal;
    }


    //
    // C++:  int64 getCPUTickCount()
    //

    //javadoc: getCPUTickCount()
    public static long getCPUTickCount()
    {
        
        long retVal = getCPUTickCount_0();
        
        return retVal;
    }


    //
    // C++:  int getNumThreads()
    //

    //javadoc: getNumThreads()
    public static int getNumThreads()
    {
        
        int retVal = getNumThreads_0();
        
        return retVal;
    }


    //
    // C++:  int getNumberOfCPUs()
    //

    //javadoc: getNumberOfCPUs()
    public static int getNumberOfCPUs()
    {
        
        int retVal = getNumberOfCPUs_0();
        
        return retVal;
    }


    //
    // C++:  int getOptimalDFTSize(int vecsize)
    //

    //javadoc: getOptimalDFTSize(vecsize)
    public static int getOptimalDFTSize(int vecsize)
    {
        
        int retVal = getOptimalDFTSize_0(vecsize);
        
        return retVal;
    }


    //
    // C++:  int getThreadNum()
    //

    //javadoc: getThreadNum()
    public static int getThreadNum()
    {
        
        int retVal = getThreadNum_0();
        
        return retVal;
    }


    //
    // C++:  int64 getTickCount()
    //

    //javadoc: getTickCount()
    public static long getTickCount()
    {
        
        long retVal = getTickCount_0();
        
        return retVal;
    }


    //
    // C++:  double getTickFrequency()
    //

    //javadoc: getTickFrequency()
    public static double getTickFrequency()
    {
        
        double retVal = getTickFrequency_0();
        
        return retVal;
    }


    //
    // C++:  void hconcat(vector_Mat src, Mat& dst)
    //

    //javadoc: hconcat(src, dst)
    public static void hconcat(List<Mat> src, Mat dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        hconcat_0(src_mat.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void idct(Mat src, Mat& dst, int flags = 0)
    //

    //javadoc: idct(src, dst, flags)
    public static void idct(Mat src, Mat dst, int flags)
    {
        
        idct_0(src.nativeObj, dst.nativeObj, flags);
        
        return;
    }

    //javadoc: idct(src, dst)
    public static void idct(Mat src, Mat dst)
    {
        
        idct_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void idft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    //

    //javadoc: idft(src, dst, flags, nonzeroRows)
    public static void idft(Mat src, Mat dst, int flags, int nonzeroRows)
    {
        
        idft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);
        
        return;
    }

    //javadoc: idft(src, dst)
    public static void idft(Mat src, Mat dst)
    {
        
        idft_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat& dst)
    //

    //javadoc: inRange(src, lowerb, upperb, dst)
    public static void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat dst)
    {
        
        inRange_0(src.nativeObj, lowerb.val[0], lowerb.val[1], lowerb.val[2], lowerb.val[3], upperb.val[0], upperb.val[1], upperb.val[2], upperb.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  void insertChannel(Mat src, Mat& dst, int coi)
    //

    //javadoc: insertChannel(src, dst, coi)
    public static void insertChannel(Mat src, Mat dst, int coi)
    {
        
        insertChannel_0(src.nativeObj, dst.nativeObj, coi);
        
        return;
    }


    //
    // C++:  double invert(Mat src, Mat& dst, int flags = DECOMP_LU)
    //

    //javadoc: invert(src, dst, flags)
    public static double invert(Mat src, Mat dst, int flags)
    {
        
        double retVal = invert_0(src.nativeObj, dst.nativeObj, flags);
        
        return retVal;
    }

    //javadoc: invert(src, dst)
    public static double invert(Mat src, Mat dst)
    {
        
        double retVal = invert_1(src.nativeObj, dst.nativeObj);
        
        return retVal;
    }


    //
    // C++:  double kmeans(Mat data, int K, Mat& bestLabels, TermCriteria criteria, int attempts, int flags, Mat& centers = Mat())
    //

    //javadoc: kmeans(data, K, bestLabels, criteria, attempts, flags, centers)
    public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags, Mat centers)
    {
        
        double retVal = kmeans_0(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags, centers.nativeObj);
        
        return retVal;
    }

    //javadoc: kmeans(data, K, bestLabels, criteria, attempts, flags)
    public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags)
    {
        
        double retVal = kmeans_1(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags);
        
        return retVal;
    }


    //
    // C++:  void line(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

    //javadoc: line(img, pt1, pt2, color, thickness, lineType, shift)
    public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift)
    {
        
        line_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
        
        return;
    }

    //javadoc: line(img, pt1, pt2, color, thickness)
    public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness)
    {
        
        line_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: line(img, pt1, pt2, color)
    public static void line(Mat img, Point pt1, Point pt2, Scalar color)
    {
        
        line_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void log(Mat src, Mat& dst)
    //

    //javadoc: log(src, dst)
    public static void log(Mat src, Mat dst)
    {
        
        log_0(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void magnitude(Mat x, Mat y, Mat& magnitude)
    //

    //javadoc: magnitude(x, y, magnitude)
    public static void magnitude(Mat x, Mat y, Mat magnitude)
    {
        
        magnitude_0(x.nativeObj, y.nativeObj, magnitude.nativeObj);
        
        return;
    }


    //
    // C++:  void max(Mat src1, Mat src2, Mat& dst)
    //

    //javadoc: max(src1, src2, dst)
    public static void max(Mat src1, Mat src2, Mat dst)
    {
        
        max_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void max(Mat src1, Scalar src2, Mat& dst)
    //

    //javadoc: max(src1, src2, dst)
    public static void max(Mat src1, Scalar src2, Mat dst)
    {
        
        max_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  Scalar mean(Mat src, Mat mask = Mat())
    //

    //javadoc: mean(src, mask)
    public static Scalar mean(Mat src, Mat mask)
    {
        
        Scalar retVal = new Scalar(mean_0(src.nativeObj, mask.nativeObj));
        
        return retVal;
    }

    //javadoc: mean(src)
    public static Scalar mean(Mat src)
    {
        
        Scalar retVal = new Scalar(mean_1(src.nativeObj));
        
        return retVal;
    }


    //
    // C++:  void meanStdDev(Mat src, vector_double& mean, vector_double& stddev, Mat mask = Mat())
    //

    //javadoc: meanStdDev(src, mean, stddev, mask)
    public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev, Mat mask)
    {
        Mat mean_mat = mean;
        Mat stddev_mat = stddev;
        meanStdDev_0(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: meanStdDev(src, mean, stddev)
    public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev)
    {
        Mat mean_mat = mean;
        Mat stddev_mat = stddev;
        meanStdDev_1(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void merge(vector_Mat mv, Mat& dst)
    //

    //javadoc: merge(mv, dst)
    public static void merge(List<Mat> mv, Mat dst)
    {
        Mat mv_mat = Converters.vector_Mat_to_Mat(mv);
        merge_0(mv_mat.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void min(Mat src1, Mat src2, Mat& dst)
    //

    //javadoc: min(src1, src2, dst)
    public static void min(Mat src1, Mat src2, Mat dst)
    {
        
        min_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void min(Mat src1, Scalar src2, Mat& dst)
    //

    //javadoc: min(src1, src2, dst)
    public static void min(Mat src1, Scalar src2, Mat dst)
    {
        
        min_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  void mixChannels(vector_Mat src, vector_Mat dst, vector_int fromTo)
    //

    //javadoc: mixChannels(src, dst, fromTo)
    public static void mixChannels(List<Mat> src, List<Mat> dst, MatOfInt fromTo)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
        Mat fromTo_mat = fromTo;
        mixChannels_0(src_mat.nativeObj, dst_mat.nativeObj, fromTo_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void mulSpectrums(Mat a, Mat b, Mat& c, int flags, bool conjB = false)
    //

    //javadoc: mulSpectrums(a, b, c, flags, conjB)
    public static void mulSpectrums(Mat a, Mat b, Mat c, int flags, boolean conjB)
    {
        
        mulSpectrums_0(a.nativeObj, b.nativeObj, c.nativeObj, flags, conjB);
        
        return;
    }

    //javadoc: mulSpectrums(a, b, c, flags)
    public static void mulSpectrums(Mat a, Mat b, Mat c, int flags)
    {
        
        mulSpectrums_1(a.nativeObj, b.nativeObj, c.nativeObj, flags);
        
        return;
    }


    //
    // C++:  void mulTransposed(Mat src, Mat& dst, bool aTa, Mat delta = Mat(), double scale = 1, int dtype = -1)
    //

    //javadoc: mulTransposed(src, dst, aTa, delta, scale, dtype)
    public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale, int dtype)
    {
        
        mulTransposed_0(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale, dtype);
        
        return;
    }

    //javadoc: mulTransposed(src, dst, aTa, delta, scale)
    public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale)
    {
        
        mulTransposed_1(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale);
        
        return;
    }

    //javadoc: mulTransposed(src, dst, aTa)
    public static void mulTransposed(Mat src, Mat dst, boolean aTa)
    {
        
        mulTransposed_2(src.nativeObj, dst.nativeObj, aTa);
        
        return;
    }


    //
    // C++:  void multiply(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    //

    //javadoc: multiply(src1, src2, dst, scale, dtype)
    public static void multiply(Mat src1, Mat src2, Mat dst, double scale, int dtype)
    {
        
        multiply_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);
        
        return;
    }

    //javadoc: multiply(src1, src2, dst, scale)
    public static void multiply(Mat src1, Mat src2, Mat dst, double scale)
    {
        
        multiply_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);
        
        return;
    }

    //javadoc: multiply(src1, src2, dst)
    public static void multiply(Mat src1, Mat src2, Mat dst)
    {
        
        multiply_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void multiply(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    //

    //javadoc: multiply(src1, src2, dst, scale, dtype)
    public static void multiply(Mat src1, Scalar src2, Mat dst, double scale, int dtype)
    {
        
        multiply_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);
        
        return;
    }

    //javadoc: multiply(src1, src2, dst, scale)
    public static void multiply(Mat src1, Scalar src2, Mat dst, double scale)
    {
        
        multiply_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);
        
        return;
    }

    //javadoc: multiply(src1, src2, dst)
    public static void multiply(Mat src1, Scalar src2, Mat dst)
    {
        
        multiply_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  double norm(Mat src1, int normType = NORM_L2, Mat mask = Mat())
    //

    //javadoc: norm(src1, normType, mask)
    public static double norm(Mat src1, int normType, Mat mask)
    {
        
        double retVal = norm_0(src1.nativeObj, normType, mask.nativeObj);
        
        return retVal;
    }

    //javadoc: norm(src1, normType)
    public static double norm(Mat src1, int normType)
    {
        
        double retVal = norm_1(src1.nativeObj, normType);
        
        return retVal;
    }

    //javadoc: norm(src1)
    public static double norm(Mat src1)
    {
        
        double retVal = norm_2(src1.nativeObj);
        
        return retVal;
    }


    //
    // C++:  double norm(Mat src1, Mat src2, int normType = NORM_L2, Mat mask = Mat())
    //

    //javadoc: norm(src1, src2, normType, mask)
    public static double norm(Mat src1, Mat src2, int normType, Mat mask)
    {
        
        double retVal = norm_3(src1.nativeObj, src2.nativeObj, normType, mask.nativeObj);
        
        return retVal;
    }

    //javadoc: norm(src1, src2, normType)
    public static double norm(Mat src1, Mat src2, int normType)
    {
        
        double retVal = norm_4(src1.nativeObj, src2.nativeObj, normType);
        
        return retVal;
    }

    //javadoc: norm(src1, src2)
    public static double norm(Mat src1, Mat src2)
    {
        
        double retVal = norm_5(src1.nativeObj, src2.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void normalize(Mat src, Mat& dst, double alpha = 1, double beta = 0, int norm_type = NORM_L2, int dtype = -1, Mat mask = Mat())
    //

    //javadoc: normalize(src, dst, alpha, beta, norm_type, dtype, mask)
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype, Mat mask)
    {
        
        normalize_0(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype, mask.nativeObj);
        
        return;
    }

    //javadoc: normalize(src, dst, alpha, beta, norm_type, dtype)
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype)
    {
        
        normalize_1(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype);
        
        return;
    }

    //javadoc: normalize(src, dst, alpha, beta, norm_type)
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type)
    {
        
        normalize_2(src.nativeObj, dst.nativeObj, alpha, beta, norm_type);
        
        return;
    }

    //javadoc: normalize(src, dst)
    public static void normalize(Mat src, Mat dst)
    {
        
        normalize_3(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void patchNaNs(Mat& a, double val = 0)
    //

    //javadoc: patchNaNs(a, val)
    public static void patchNaNs(Mat a, double val)
    {
        
        patchNaNs_0(a.nativeObj, val);
        
        return;
    }

    //javadoc: patchNaNs(a)
    public static void patchNaNs(Mat a)
    {
        
        patchNaNs_1(a.nativeObj);
        
        return;
    }


    //
    // C++:  void perspectiveTransform(Mat src, Mat& dst, Mat m)
    //

    //javadoc: perspectiveTransform(src, dst, m)
    public static void perspectiveTransform(Mat src, Mat dst, Mat m)
    {
        
        perspectiveTransform_0(src.nativeObj, dst.nativeObj, m.nativeObj);
        
        return;
    }


    //
    // C++:  void phase(Mat x, Mat y, Mat& angle, bool angleInDegrees = false)
    //

    //javadoc: phase(x, y, angle, angleInDegrees)
    public static void phase(Mat x, Mat y, Mat angle, boolean angleInDegrees)
    {
        
        phase_0(x.nativeObj, y.nativeObj, angle.nativeObj, angleInDegrees);
        
        return;
    }

    //javadoc: phase(x, y, angle)
    public static void phase(Mat x, Mat y, Mat angle)
    {
        
        phase_1(x.nativeObj, y.nativeObj, angle.nativeObj);
        
        return;
    }


    //
    // C++:  void polarToCart(Mat magnitude, Mat angle, Mat& x, Mat& y, bool angleInDegrees = false)
    //

    //javadoc: polarToCart(magnitude, angle, x, y, angleInDegrees)
    public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y, boolean angleInDegrees)
    {
        
        polarToCart_0(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj, angleInDegrees);
        
        return;
    }

    //javadoc: polarToCart(magnitude, angle, x, y)
    public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y)
    {
        
        polarToCart_1(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj);
        
        return;
    }


    //
    // C++:  void polylines(Mat& img, vector_vector_Point pts, bool isClosed, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

    //javadoc: polylines(img, pts, isClosed, color, thickness, lineType, shift)
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness, int lineType, int shift)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_0(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
        
        return;
    }

    //javadoc: polylines(img, pts, isClosed, color, thickness)
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_1(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: polylines(img, pts, isClosed, color)
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_2(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void pow(Mat src, double power, Mat& dst)
    //

    //javadoc: pow(src, power, dst)
    public static void pow(Mat src, double power, Mat dst)
    {
        
        pow_0(src.nativeObj, power, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void putText(Mat img, string text, Point org, int fontFace, double fontScale, Scalar color, int thickness = 1, int lineType = 8, bool bottomLeftOrigin = false)
    //

    //javadoc: putText(img, text, org, fontFace, fontScale, color, thickness, lineType, bottomLeftOrigin)
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness, int lineType, boolean bottomLeftOrigin)
    {
        
        putText_0(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, bottomLeftOrigin);
        
        return;
    }

    //javadoc: putText(img, text, org, fontFace, fontScale, color, thickness)
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness)
    {
        
        putText_1(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: putText(img, text, org, fontFace, fontScale, color)
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color)
    {
        
        putText_2(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void randShuffle_(Mat& dst, double iterFactor = 1.)
    //

    //javadoc: randShuffle_(dst, iterFactor)
    public static void randShuffle(Mat dst, double iterFactor)
    {
        
        randShuffle_0(dst.nativeObj, iterFactor);
        
        return;
    }

    //javadoc: randShuffle_(dst)
    public static void randShuffle(Mat dst)
    {
        
        randShuffle_1(dst.nativeObj);
        
        return;
    }


    //
    // C++:  void randn(Mat& dst, double mean, double stddev)
    //

    //javadoc: randn(dst, mean, stddev)
    public static void randn(Mat dst, double mean, double stddev)
    {
        
        randn_0(dst.nativeObj, mean, stddev);
        
        return;
    }


    //
    // C++:  void randu(Mat& dst, double low, double high)
    //

    //javadoc: randu(dst, low, high)
    public static void randu(Mat dst, double low, double high)
    {
        
        randu_0(dst.nativeObj, low, high);
        
        return;
    }


    //
    // C++:  void rectangle(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

    //javadoc: rectangle(img, pt1, pt2, color, thickness, lineType, shift)
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift)
    {
        
        rectangle_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);
        
        return;
    }

    //javadoc: rectangle(img, pt1, pt2, color, thickness)
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness)
    {
        
        rectangle_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);
        
        return;
    }

    //javadoc: rectangle(img, pt1, pt2, color)
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color)
    {
        
        rectangle_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }


    //
    // C++:  void reduce(Mat src, Mat& dst, int dim, int rtype, int dtype = -1)
    //

    //javadoc: reduce(src, dst, dim, rtype, dtype)
    public static void reduce(Mat src, Mat dst, int dim, int rtype, int dtype)
    {
        
        reduce_0(src.nativeObj, dst.nativeObj, dim, rtype, dtype);
        
        return;
    }

    //javadoc: reduce(src, dst, dim, rtype)
    public static void reduce(Mat src, Mat dst, int dim, int rtype)
    {
        
        reduce_1(src.nativeObj, dst.nativeObj, dim, rtype);
        
        return;
    }


    //
    // C++:  void repeat(Mat src, int ny, int nx, Mat& dst)
    //

    //javadoc: repeat(src, ny, nx, dst)
    public static void repeat(Mat src, int ny, int nx, Mat dst)
    {
        
        repeat_0(src.nativeObj, ny, nx, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void scaleAdd(Mat src1, double alpha, Mat src2, Mat& dst)
    //

    //javadoc: scaleAdd(src1, alpha, src2, dst)
    public static void scaleAdd(Mat src1, double alpha, Mat src2, Mat dst)
    {
        
        scaleAdd_0(src1.nativeObj, alpha, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void setErrorVerbosity(bool verbose)
    //

    //javadoc: setErrorVerbosity(verbose)
    public static void setErrorVerbosity(boolean verbose)
    {
        
        setErrorVerbosity_0(verbose);
        
        return;
    }


    //
    // C++:  void setIdentity(Mat& mtx, Scalar s = Scalar(1))
    //

    //javadoc: setIdentity(mtx, s)
    public static void setIdentity(Mat mtx, Scalar s)
    {
        
        setIdentity_0(mtx.nativeObj, s.val[0], s.val[1], s.val[2], s.val[3]);
        
        return;
    }

    //javadoc: setIdentity(mtx)
    public static void setIdentity(Mat mtx)
    {
        
        setIdentity_1(mtx.nativeObj);
        
        return;
    }


    //
    // C++:  void setNumThreads(int nthreads)
    //

    //javadoc: setNumThreads(nthreads)
    public static void setNumThreads(int nthreads)
    {
        
        setNumThreads_0(nthreads);
        
        return;
    }


    //
    // C++:  void setRNGSeed(int seed)
    //

    //javadoc: setRNGSeed(seed)
    public static void setRNGSeed(int seed)
    {
        
        setRNGSeed_0(seed);
        
        return;
    }


    //
    // C++:  bool solve(Mat src1, Mat src2, Mat& dst, int flags = DECOMP_LU)
    //

    //javadoc: solve(src1, src2, dst, flags)
    public static boolean solve(Mat src1, Mat src2, Mat dst, int flags)
    {
        
        boolean retVal = solve_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, flags);
        
        return retVal;
    }

    //javadoc: solve(src1, src2, dst)
    public static boolean solve(Mat src1, Mat src2, Mat dst)
    {
        
        boolean retVal = solve_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return retVal;
    }


    //
    // C++:  int solveCubic(Mat coeffs, Mat& roots)
    //

    //javadoc: solveCubic(coeffs, roots)
    public static int solveCubic(Mat coeffs, Mat roots)
    {
        
        int retVal = solveCubic_0(coeffs.nativeObj, roots.nativeObj);
        
        return retVal;
    }


    //
    // C++:  double solvePoly(Mat coeffs, Mat& roots, int maxIters = 300)
    //

    //javadoc: solvePoly(coeffs, roots, maxIters)
    public static double solvePoly(Mat coeffs, Mat roots, int maxIters)
    {
        
        double retVal = solvePoly_0(coeffs.nativeObj, roots.nativeObj, maxIters);
        
        return retVal;
    }

    //javadoc: solvePoly(coeffs, roots)
    public static double solvePoly(Mat coeffs, Mat roots)
    {
        
        double retVal = solvePoly_1(coeffs.nativeObj, roots.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void sort(Mat src, Mat& dst, int flags)
    //

    //javadoc: sort(src, dst, flags)
    public static void sort(Mat src, Mat dst, int flags)
    {
        
        sort_0(src.nativeObj, dst.nativeObj, flags);
        
        return;
    }


    //
    // C++:  void sortIdx(Mat src, Mat& dst, int flags)
    //

    //javadoc: sortIdx(src, dst, flags)
    public static void sortIdx(Mat src, Mat dst, int flags)
    {
        
        sortIdx_0(src.nativeObj, dst.nativeObj, flags);
        
        return;
    }


    //
    // C++:  void split(Mat m, vector_Mat& mv)
    //

    //javadoc: split(m, mv)
    public static void split(Mat m, List<Mat> mv)
    {
        Mat mv_mat = new Mat();
        split_0(m.nativeObj, mv_mat.nativeObj);
        Converters.Mat_to_vector_Mat(mv_mat, mv);
        mv_mat.release();
        return;
    }


    //
    // C++:  void sqrt(Mat src, Mat& dst)
    //

    //javadoc: sqrt(src, dst)
    public static void sqrt(Mat src, Mat dst)
    {
        
        sqrt_0(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void subtract(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

    //javadoc: subtract(src1, src2, dst, mask, dtype)
    public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask, int dtype)
    {
        
        subtract_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);
        
        return;
    }

    //javadoc: subtract(src1, src2, dst, mask)
    public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask)
    {
        
        subtract_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: subtract(src1, src2, dst)
    public static void subtract(Mat src1, Mat src2, Mat dst)
    {
        
        subtract_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void subtract(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

    //javadoc: subtract(src1, src2, dst, mask, dtype)
    public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype)
    {
        
        subtract_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);
        
        return;
    }

    //javadoc: subtract(src1, src2, dst, mask)
    public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask)
    {
        
        subtract_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: subtract(src1, src2, dst)
    public static void subtract(Mat src1, Scalar src2, Mat dst)
    {
        
        subtract_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);
        
        return;
    }


    //
    // C++:  Scalar sum(Mat src)
    //

    //javadoc: sum(src)
    public static Scalar sumElems(Mat src)
    {
        
        Scalar retVal = new Scalar(sumElems_0(src.nativeObj));
        
        return retVal;
    }


    //
    // C++:  Scalar trace(Mat mtx)
    //

    //javadoc: trace(mtx)
    public static Scalar trace(Mat mtx)
    {
        
        Scalar retVal = new Scalar(trace_0(mtx.nativeObj));
        
        return retVal;
    }


    //
    // C++:  void transform(Mat src, Mat& dst, Mat m)
    //

    //javadoc: transform(src, dst, m)
    public static void transform(Mat src, Mat dst, Mat m)
    {
        
        transform_0(src.nativeObj, dst.nativeObj, m.nativeObj);
        
        return;
    }


    //
    // C++:  void transpose(Mat src, Mat& dst)
    //

    //javadoc: transpose(src, dst)
    public static void transpose(Mat src, Mat dst)
    {
        
        transpose_0(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void vconcat(vector_Mat src, Mat& dst)
    //

    //javadoc: vconcat(src, dst)
    public static void vconcat(List<Mat> src, Mat dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        vconcat_0(src_mat.nativeObj, dst.nativeObj);
        
        return;
    }


    // manual port
    public static class MinMaxLocResult {
        public double minVal;
        public double maxVal;
        public Point minLoc;
        public Point maxLoc;

        public MinMaxLocResult() {
            minVal=0; maxVal=0;
            minLoc=new Point();
            maxLoc=new Point();
        }
    }

    // C++: minMaxLoc(Mat src, double* minVal, double* maxVal=0, Point* minLoc=0, Point* maxLoc=0, InputArray mask=noArray())

    //javadoc: minMaxLoc(src, mask)
    public static MinMaxLocResult minMaxLoc(Mat src, Mat mask) {
        MinMaxLocResult res = new MinMaxLocResult();
        long maskNativeObj=0;
        if (mask != null) {
            maskNativeObj=mask.nativeObj;
        }
        double resarr[] = n_minMaxLocManual(src.nativeObj, maskNativeObj);
        res.minVal=resarr[0];
        res.maxVal=resarr[1];
        res.minLoc.x=resarr[2];
        res.minLoc.y=resarr[3];
        res.maxLoc.x=resarr[4];
        res.maxLoc.y=resarr[5];
        return res;
    }

    //javadoc: minMaxLoc(src)
    public static MinMaxLocResult minMaxLoc(Mat src) {
        return minMaxLoc(src, null);
    }


    // C++: Size getTextSize(const string& text, int fontFace, double fontScale, int thickness, int* baseLine);
    //javadoc:getTextSize(text, fontFace, fontScale, thickness, baseLine)
    public static Size getTextSize(String text, int fontFace, double fontScale, int thickness, int[] baseLine) {
        if(baseLine != null && baseLine.length != 1)
            throw new java.lang.IllegalArgumentException("'baseLine' must be 'int[1]' or 'null'.");
        Size retVal = new Size(n_getTextSize(text, fontFace, fontScale, thickness, baseLine));
        return retVal;
    }



    // C++:  void LUT(Mat src, Mat lut, Mat& dst, int interpolation = 0)
    private static native void LUT_0(long src_nativeObj, long lut_nativeObj, long dst_nativeObj, int interpolation);
    private static native void LUT_1(long src_nativeObj, long lut_nativeObj, long dst_nativeObj);

    // C++:  double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    private static native double Mahalanobis_0(long v1_nativeObj, long v2_nativeObj, long icovar_nativeObj);

    // C++:  void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    private static native void PCABackProject_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, long result_nativeObj);

    // C++:  void PCACompute(Mat data, Mat& mean, Mat& eigenvectors, int maxComponents = 0)
    private static native void PCACompute_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, int maxComponents);
    private static native void PCACompute_1(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj);

    // C++:  void PCAComputeVar(Mat data, Mat& mean, Mat& eigenvectors, double retainedVariance)
    private static native void PCAComputeVar_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, double retainedVariance);

    // C++:  void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    private static native void PCAProject_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, long result_nativeObj);

    // C++:  void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat& dst)
    private static native void SVBackSubst_0(long w_nativeObj, long u_nativeObj, long vt_nativeObj, long rhs_nativeObj, long dst_nativeObj);

    // C++:  void SVDecomp(Mat src, Mat& w, Mat& u, Mat& vt, int flags = 0)
    private static native void SVDecomp_0(long src_nativeObj, long w_nativeObj, long u_nativeObj, long vt_nativeObj, int flags);
    private static native void SVDecomp_1(long src_nativeObj, long w_nativeObj, long u_nativeObj, long vt_nativeObj);

    // C++:  void absdiff(Mat src1, Mat src2, Mat& dst)
    private static native void absdiff_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void absdiff(Mat src1, Scalar src2, Mat& dst)
    private static native void absdiff_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void add(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void add_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void add_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void add_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void add(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void add_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void add_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj);
    private static native void add_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat& dst, int dtype = -1)
    private static native void addWeighted_0(long src1_nativeObj, double alpha, long src2_nativeObj, double beta, double gamma, long dst_nativeObj, int dtype);
    private static native void addWeighted_1(long src1_nativeObj, double alpha, long src2_nativeObj, double beta, double gamma, long dst_nativeObj);

    // C++:  void arrowedLine(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int line_type = 8, int shift = 0, double tipLength = 0.1)
    private static native void arrowedLine_0(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int line_type, int shift, double tipLength);
    private static native void arrowedLine_1(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void batchDistance(Mat src1, Mat src2, Mat& dist, int dtype, Mat& nidx, int normType = NORM_L2, int K = 0, Mat mask = Mat(), int update = 0, bool crosscheck = false)
    private static native void batchDistance_0(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj, int normType, int K, long mask_nativeObj, int update, boolean crosscheck);
    private static native void batchDistance_1(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj, int normType, int K);
    private static native void batchDistance_2(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj);

    // C++:  void bitwise_and(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_and_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_and_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_not(Mat src, Mat& dst, Mat mask = Mat())
    private static native void bitwise_not_0(long src_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_not_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_or(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_or_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_or_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_xor(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_xor_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_xor_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void calcCovarMatrix(Mat samples, Mat& covar, Mat& mean, int flags, int ctype = CV_64F)
    private static native void calcCovarMatrix_0(long samples_nativeObj, long covar_nativeObj, long mean_nativeObj, int flags, int ctype);
    private static native void calcCovarMatrix_1(long samples_nativeObj, long covar_nativeObj, long mean_nativeObj, int flags);

    // C++:  void cartToPolar(Mat x, Mat y, Mat& magnitude, Mat& angle, bool angleInDegrees = false)
    private static native void cartToPolar_0(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj, long angle_nativeObj, boolean angleInDegrees);
    private static native void cartToPolar_1(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj, long angle_nativeObj);

    // C++:  bool checkRange(Mat a, bool quiet = true,  _hidden_ * pos = 0, double minVal = -DBL_MAX, double maxVal = DBL_MAX)
    private static native boolean checkRange_0(long a_nativeObj, boolean quiet, double minVal, double maxVal);
    private static native boolean checkRange_1(long a_nativeObj);

    // C++:  void circle(Mat& img, Point center, int radius, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void circle_0(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void circle_1(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void circle_2(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  bool clipLine(Rect imgRect, Point& pt1, Point& pt2)
    private static native boolean clipLine_0(int imgRect_x, int imgRect_y, int imgRect_width, int imgRect_height, double pt1_x, double pt1_y, double[] pt1_out, double pt2_x, double pt2_y, double[] pt2_out);

    // C++:  void compare(Mat src1, Mat src2, Mat& dst, int cmpop)
    private static native void compare_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, int cmpop);

    // C++:  void compare(Mat src1, Scalar src2, Mat& dst, int cmpop)
    private static native void compare_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, int cmpop);

    // C++:  void completeSymm(Mat& mtx, bool lowerToUpper = false)
    private static native void completeSymm_0(long mtx_nativeObj, boolean lowerToUpper);
    private static native void completeSymm_1(long mtx_nativeObj);

    // C++:  void convertScaleAbs(Mat src, Mat& dst, double alpha = 1, double beta = 0)
    private static native void convertScaleAbs_0(long src_nativeObj, long dst_nativeObj, double alpha, double beta);
    private static native void convertScaleAbs_1(long src_nativeObj, long dst_nativeObj);

    // C++:  int countNonZero(Mat src)
    private static native int countNonZero_0(long src_nativeObj);

    // C++:  float cubeRoot(float val)
    private static native float cubeRoot_0(float val);

    // C++:  void dct(Mat src, Mat& dst, int flags = 0)
    private static native void dct_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native void dct_1(long src_nativeObj, long dst_nativeObj);

    // C++:  double determinant(Mat mtx)
    private static native double determinant_0(long mtx_nativeObj);

    // C++:  void dft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    private static native void dft_0(long src_nativeObj, long dst_nativeObj, int flags, int nonzeroRows);
    private static native void dft_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void divide(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void divide_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale, int dtype);
    private static native void divide_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale);
    private static native void divide_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void divide(double scale, Mat src2, Mat& dst, int dtype = -1)
    private static native void divide_3(double scale, long src2_nativeObj, long dst_nativeObj, int dtype);
    private static native void divide_4(double scale, long src2_nativeObj, long dst_nativeObj);

    // C++:  void divide(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void divide_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale, int dtype);
    private static native void divide_6(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale);
    private static native void divide_7(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void drawMarker(Mat& img, Point position, Scalar color, int markerType = MARKER_CROSS, int markerSize = 20, int thickness = 1, int line_type = 8)
    private static native void drawMarker_0(long img_nativeObj, double position_x, double position_y, double color_val0, double color_val1, double color_val2, double color_val3, int markerType, int markerSize, int thickness, int line_type);
    private static native void drawMarker_1(long img_nativeObj, double position_x, double position_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  bool eigen(Mat src, bool computeEigenvectors, Mat& eigenvalues, Mat& eigenvectors)
    private static native boolean eigen_0(long src_nativeObj, boolean computeEigenvectors, long eigenvalues_nativeObj, long eigenvectors_nativeObj);

    // C++:  void ellipse(Mat& img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void ellipse_0(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void ellipse_1(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void ellipse_2(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void ellipse(Mat& img, RotatedRect box, Scalar color, int thickness = 1, int lineType = 8)
    private static native void ellipse_3(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType);
    private static native void ellipse_4(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void ellipse_5(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, vector_Point& pts)
    private static native void ellipse2Poly_0(double center_x, double center_y, double axes_width, double axes_height, int angle, int arcStart, int arcEnd, int delta, long pts_mat_nativeObj);

    // C++:  void exp(Mat src, Mat& dst)
    private static native void exp_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void extractChannel(Mat src, Mat& dst, int coi)
    private static native void extractChannel_0(long src_nativeObj, long dst_nativeObj, int coi);

    // C++:  float fastAtan2(float y, float x)
    private static native float fastAtan2_0(float y, float x);

    // C++:  void fillConvexPoly(Mat& img, vector_Point points, Scalar color, int lineType = 8, int shift = 0)
    private static native void fillConvexPoly_0(long img_nativeObj, long points_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int lineType, int shift);
    private static native void fillConvexPoly_1(long img_nativeObj, long points_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void fillPoly(Mat& img, vector_vector_Point pts, Scalar color, int lineType = 8, int shift = 0, Point offset = Point())
    private static native void fillPoly_0(long img_nativeObj, long pts_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int lineType, int shift, double offset_x, double offset_y);
    private static native void fillPoly_1(long img_nativeObj, long pts_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void findNonZero(Mat src, Mat& idx)
    private static native void findNonZero_0(long src_nativeObj, long idx_nativeObj);

    // C++:  void flip(Mat src, Mat& dst, int flipCode)
    private static native void flip_0(long src_nativeObj, long dst_nativeObj, int flipCode);

    // C++:  void gemm(Mat src1, Mat src2, double alpha, Mat src3, double beta, Mat& dst, int flags = 0)
    private static native void gemm_0(long src1_nativeObj, long src2_nativeObj, double alpha, long src3_nativeObj, double beta, long dst_nativeObj, int flags);
    private static native void gemm_1(long src1_nativeObj, long src2_nativeObj, double alpha, long src3_nativeObj, double beta, long dst_nativeObj);

    // C++:  string getBuildInformation()
    private static native String getBuildInformation_0();

    // C++:  int64 getCPUTickCount()
    private static native long getCPUTickCount_0();

    // C++:  int getNumThreads()
    private static native int getNumThreads_0();

    // C++:  int getNumberOfCPUs()
    private static native int getNumberOfCPUs_0();

    // C++:  int getOptimalDFTSize(int vecsize)
    private static native int getOptimalDFTSize_0(int vecsize);

    // C++:  int getThreadNum()
    private static native int getThreadNum_0();

    // C++:  int64 getTickCount()
    private static native long getTickCount_0();

    // C++:  double getTickFrequency()
    private static native double getTickFrequency_0();

    // C++:  void hconcat(vector_Mat src, Mat& dst)
    private static native void hconcat_0(long src_mat_nativeObj, long dst_nativeObj);

    // C++:  void idct(Mat src, Mat& dst, int flags = 0)
    private static native void idct_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native void idct_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void idft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    private static native void idft_0(long src_nativeObj, long dst_nativeObj, int flags, int nonzeroRows);
    private static native void idft_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat& dst)
    private static native void inRange_0(long src_nativeObj, double lowerb_val0, double lowerb_val1, double lowerb_val2, double lowerb_val3, double upperb_val0, double upperb_val1, double upperb_val2, double upperb_val3, long dst_nativeObj);

    // C++:  void insertChannel(Mat src, Mat& dst, int coi)
    private static native void insertChannel_0(long src_nativeObj, long dst_nativeObj, int coi);

    // C++:  double invert(Mat src, Mat& dst, int flags = DECOMP_LU)
    private static native double invert_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native double invert_1(long src_nativeObj, long dst_nativeObj);

    // C++:  double kmeans(Mat data, int K, Mat& bestLabels, TermCriteria criteria, int attempts, int flags, Mat& centers = Mat())
    private static native double kmeans_0(long data_nativeObj, int K, long bestLabels_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, int attempts, int flags, long centers_nativeObj);
    private static native double kmeans_1(long data_nativeObj, int K, long bestLabels_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, int attempts, int flags);

    // C++:  void line(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void line_0(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void line_1(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void line_2(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void log(Mat src, Mat& dst)
    private static native void log_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void magnitude(Mat x, Mat y, Mat& magnitude)
    private static native void magnitude_0(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj);

    // C++:  void max(Mat src1, Mat src2, Mat& dst)
    private static native void max_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void max(Mat src1, Scalar src2, Mat& dst)
    private static native void max_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  Scalar mean(Mat src, Mat mask = Mat())
    private static native double[] mean_0(long src_nativeObj, long mask_nativeObj);
    private static native double[] mean_1(long src_nativeObj);

    // C++:  void meanStdDev(Mat src, vector_double& mean, vector_double& stddev, Mat mask = Mat())
    private static native void meanStdDev_0(long src_nativeObj, long mean_mat_nativeObj, long stddev_mat_nativeObj, long mask_nativeObj);
    private static native void meanStdDev_1(long src_nativeObj, long mean_mat_nativeObj, long stddev_mat_nativeObj);

    // C++:  void merge(vector_Mat mv, Mat& dst)
    private static native void merge_0(long mv_mat_nativeObj, long dst_nativeObj);

    // C++:  void min(Mat src1, Mat src2, Mat& dst)
    private static native void min_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void min(Mat src1, Scalar src2, Mat& dst)
    private static native void min_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void mixChannels(vector_Mat src, vector_Mat dst, vector_int fromTo)
    private static native void mixChannels_0(long src_mat_nativeObj, long dst_mat_nativeObj, long fromTo_mat_nativeObj);

    // C++:  void mulSpectrums(Mat a, Mat b, Mat& c, int flags, bool conjB = false)
    private static native void mulSpectrums_0(long a_nativeObj, long b_nativeObj, long c_nativeObj, int flags, boolean conjB);
    private static native void mulSpectrums_1(long a_nativeObj, long b_nativeObj, long c_nativeObj, int flags);

    // C++:  void mulTransposed(Mat src, Mat& dst, bool aTa, Mat delta = Mat(), double scale = 1, int dtype = -1)
    private static native void mulTransposed_0(long src_nativeObj, long dst_nativeObj, boolean aTa, long delta_nativeObj, double scale, int dtype);
    private static native void mulTransposed_1(long src_nativeObj, long dst_nativeObj, boolean aTa, long delta_nativeObj, double scale);
    private static native void mulTransposed_2(long src_nativeObj, long dst_nativeObj, boolean aTa);

    // C++:  void multiply(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void multiply_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale, int dtype);
    private static native void multiply_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale);
    private static native void multiply_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void multiply(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void multiply_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale, int dtype);
    private static native void multiply_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale);
    private static native void multiply_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  double norm(Mat src1, int normType = NORM_L2, Mat mask = Mat())
    private static native double norm_0(long src1_nativeObj, int normType, long mask_nativeObj);
    private static native double norm_1(long src1_nativeObj, int normType);
    private static native double norm_2(long src1_nativeObj);

    // C++:  double norm(Mat src1, Mat src2, int normType = NORM_L2, Mat mask = Mat())
    private static native double norm_3(long src1_nativeObj, long src2_nativeObj, int normType, long mask_nativeObj);
    private static native double norm_4(long src1_nativeObj, long src2_nativeObj, int normType);
    private static native double norm_5(long src1_nativeObj, long src2_nativeObj);

    // C++:  void normalize(Mat src, Mat& dst, double alpha = 1, double beta = 0, int norm_type = NORM_L2, int dtype = -1, Mat mask = Mat())
    private static native void normalize_0(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type, int dtype, long mask_nativeObj);
    private static native void normalize_1(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type, int dtype);
    private static native void normalize_2(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type);
    private static native void normalize_3(long src_nativeObj, long dst_nativeObj);

    // C++:  void patchNaNs(Mat& a, double val = 0)
    private static native void patchNaNs_0(long a_nativeObj, double val);
    private static native void patchNaNs_1(long a_nativeObj);

    // C++:  void perspectiveTransform(Mat src, Mat& dst, Mat m)
    private static native void perspectiveTransform_0(long src_nativeObj, long dst_nativeObj, long m_nativeObj);

    // C++:  void phase(Mat x, Mat y, Mat& angle, bool angleInDegrees = false)
    private static native void phase_0(long x_nativeObj, long y_nativeObj, long angle_nativeObj, boolean angleInDegrees);
    private static native void phase_1(long x_nativeObj, long y_nativeObj, long angle_nativeObj);

    // C++:  void polarToCart(Mat magnitude, Mat angle, Mat& x, Mat& y, bool angleInDegrees = false)
    private static native void polarToCart_0(long magnitude_nativeObj, long angle_nativeObj, long x_nativeObj, long y_nativeObj, boolean angleInDegrees);
    private static native void polarToCart_1(long magnitude_nativeObj, long angle_nativeObj, long x_nativeObj, long y_nativeObj);

    // C++:  void polylines(Mat& img, vector_vector_Point pts, bool isClosed, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void polylines_0(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void polylines_1(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void polylines_2(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void pow(Mat src, double power, Mat& dst)
    private static native void pow_0(long src_nativeObj, double power, long dst_nativeObj);

    // C++:  void putText(Mat img, string text, Point org, int fontFace, double fontScale, Scalar color, int thickness = 1, int lineType = 8, bool bottomLeftOrigin = false)
    private static native void putText_0(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, boolean bottomLeftOrigin);
    private static native void putText_1(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void putText_2(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void randShuffle_(Mat& dst, double iterFactor = 1.)
    private static native void randShuffle_0(long dst_nativeObj, double iterFactor);
    private static native void randShuffle_1(long dst_nativeObj);

    // C++:  void randn(Mat& dst, double mean, double stddev)
    private static native void randn_0(long dst_nativeObj, double mean, double stddev);

    // C++:  void randu(Mat& dst, double low, double high)
    private static native void randu_0(long dst_nativeObj, double low, double high);

    // C++:  void rectangle(Mat& img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void rectangle_0(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void rectangle_1(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void rectangle_2(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void reduce(Mat src, Mat& dst, int dim, int rtype, int dtype = -1)
    private static native void reduce_0(long src_nativeObj, long dst_nativeObj, int dim, int rtype, int dtype);
    private static native void reduce_1(long src_nativeObj, long dst_nativeObj, int dim, int rtype);

    // C++:  void repeat(Mat src, int ny, int nx, Mat& dst)
    private static native void repeat_0(long src_nativeObj, int ny, int nx, long dst_nativeObj);

    // C++:  void scaleAdd(Mat src1, double alpha, Mat src2, Mat& dst)
    private static native void scaleAdd_0(long src1_nativeObj, double alpha, long src2_nativeObj, long dst_nativeObj);

    // C++:  void setErrorVerbosity(bool verbose)
    private static native void setErrorVerbosity_0(boolean verbose);

    // C++:  void setIdentity(Mat& mtx, Scalar s = Scalar(1))
    private static native void setIdentity_0(long mtx_nativeObj, double s_val0, double s_val1, double s_val2, double s_val3);
    private static native void setIdentity_1(long mtx_nativeObj);

    // C++:  void setNumThreads(int nthreads)
    private static native void setNumThreads_0(int nthreads);

    // C++:  void setRNGSeed(int seed)
    private static native void setRNGSeed_0(int seed);

    // C++:  bool solve(Mat src1, Mat src2, Mat& dst, int flags = DECOMP_LU)
    private static native boolean solve_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, int flags);
    private static native boolean solve_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  int solveCubic(Mat coeffs, Mat& roots)
    private static native int solveCubic_0(long coeffs_nativeObj, long roots_nativeObj);

    // C++:  double solvePoly(Mat coeffs, Mat& roots, int maxIters = 300)
    private static native double solvePoly_0(long coeffs_nativeObj, long roots_nativeObj, int maxIters);
    private static native double solvePoly_1(long coeffs_nativeObj, long roots_nativeObj);

    // C++:  void sort(Mat src, Mat& dst, int flags)
    private static native void sort_0(long src_nativeObj, long dst_nativeObj, int flags);

    // C++:  void sortIdx(Mat src, Mat& dst, int flags)
    private static native void sortIdx_0(long src_nativeObj, long dst_nativeObj, int flags);

    // C++:  void split(Mat m, vector_Mat& mv)
    private static native void split_0(long m_nativeObj, long mv_mat_nativeObj);

    // C++:  void sqrt(Mat src, Mat& dst)
    private static native void sqrt_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void subtract(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void subtract_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void subtract_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void subtract_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void subtract(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void subtract_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void subtract_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj);
    private static native void subtract_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  Scalar sum(Mat src)
    private static native double[] sumElems_0(long src_nativeObj);

    // C++:  Scalar trace(Mat mtx)
    private static native double[] trace_0(long mtx_nativeObj);

    // C++:  void transform(Mat src, Mat& dst, Mat m)
    private static native void transform_0(long src_nativeObj, long dst_nativeObj, long m_nativeObj);

    // C++:  void transpose(Mat src, Mat& dst)
    private static native void transpose_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void vconcat(vector_Mat src, Mat& dst)
    private static native void vconcat_0(long src_mat_nativeObj, long dst_nativeObj);
    private static native double[] n_minMaxLocManual(long src_nativeObj, long mask_nativeObj);
    private static native double[] n_getTextSize(String text, int fontFace, double fontScale, int thickness, int[] baseLine);

}
